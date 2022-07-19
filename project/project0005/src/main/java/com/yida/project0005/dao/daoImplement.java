/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yida.project0005.dao;
import com.yida.project0005.dto.Student;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.*

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//import java.util.*

public class daoImplement implements daoInterface{

    public static final String STUDENT_FILE = "student.txt";
    
    //variables are seperated by ::
    public static final String DELIMITER = "::";
    
    //Hash map
    private final Map<String, Student> students = new HashMap<>();
    
    @Override
    public Student addStudent(String studentId, Student student)throws daoException 
    {
        loadStudentFiles();
        Student prevStudent = students.put(studentId, student);
        writeStudentFile();
        return prevStudent;
    }

    @Override
    public List<Student> getAllStudents() throws daoException
    
    {
        loadStudentFiles();
        return new ArrayList<>(students.values());
    }

    
    
    @Override
    public Student getStudent(String studentId)throws daoException 
    {
        loadStudentFiles();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId)throws daoException 
    {
        loadStudentFiles();
        
        //remove it from hashmap
        Student removedStudent = students.remove(studentId);
        
        writeStudentFile();
        return removedStudent;
    }
    private Student unmarshallStudent(String studentAsText)
    {

        String[] studentTokens = studentAsText.split(DELIMITER);
        String studentId = studentTokens[0];
        Student studentFromFile = new Student(studentId);
        studentFromFile.setFirstName(studentTokens[1]);
        studentFromFile.setLastName(studentTokens[2]);
        studentFromFile.setCohort(studentTokens[3]); 
        return studentFromFile;
    }
    
    
    
    
    /**
     * read student file and use unmarshallStudent function to put it in
     * a hashmap called student
     * 
     * @throws daoException 
     */
    private void loadStudentFiles() throws daoException {
        Scanner scanner;

        try {
            // Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(STUDENT_FILE)));
        } catch (FileNotFoundException e) {
            throw new daoException(
                    "-_- Could not load roster data into memory.", e);
        }

        String currentLine;
        Student currentStudent;
        while (scanner.hasNextLine()) {

            currentLine = scanner.nextLine();
            currentStudent = unmarshallStudent(currentLine);
            students.put(currentStudent.getStudentId(), currentStudent);
        }
        scanner.close();
        }
    
    
    
    
    private String marshallStudent(Student aStudent){

        String studentAsText = aStudent.getStudentId() + DELIMITER;

        studentAsText += aStudent.getFirstName() + DELIMITER;

        studentAsText += aStudent.getLastName() + DELIMITER;

        studentAsText += aStudent.getCohort();

        return studentAsText;
        }



    private void writeStudentFile() throws daoException {

        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(STUDENT_FILE));
        } catch (IOException e) {
            throw new daoException(
                    "Could not save student data.", e);
        }

        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for (Student currentStudent : studentList) {
            // turn a Student into a String
            studentAsText = marshallStudent(currentStudent);
            // write the Student object to the file
            out.println(studentAsText);
            // force PrintWriter to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
        }
    
}
