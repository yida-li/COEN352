/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yida.project0005.controller;

import com.yida.project0005.dao.daoInterface;
import com.yida.project0005.dao.daoException;
import com.yida.project0005.dto.Student;
import com.yida.project0005.ui.view;
import java.util.List;

public class controller {
    
  

    private final view view;
    private final daoInterface dao;
    public void run() {
    boolean flag = true;
    int menuSelection = 0;
    try {
        while (flag) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    viewStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        exitMessage();
    } catch (daoException e) {
        view.displayErrorMessage(e.getMessage());
    }
}

   private int getMenuSelection() {
    return view.printMenuAndGetSelection();
}


private void createStudent() throws daoException {
    view.displayCreateStudentBanner();
    Student newStudent = view.getNewStudentInfo();
    dao.addStudent(newStudent.getStudentId(), newStudent);
    view.displayCreateSuccessBanner();
}
  private void listStudents() throws daoException {
    view.displayDisplayAllBanner();
    List<Student> studentList = dao.getAllStudents();
    view.displayStudentList(studentList);
}
   private void viewStudent() throws daoException {
    view.displayDisplayStudentBanner();
    String studentId = view.getStudentIdChoice();
    Student student = dao.getStudent(studentId);
    view.displayStudent(student);
}

private void removeStudent() throws daoException {
    view.displayRemoveStudentBanner();
    String studentId = view.getStudentIdChoice();
    Student removedStudent = dao.removeStudent(studentId);
    view.displayRemoveResult(removedStudent);
}

private void unknownCommand() {
    view.displayUnknownCommandBanner();
}

private void exitMessage() {
    view.displayExitBanner();
}
   public controller(daoInterface dao, view view) {
    this.dao = dao;
    this.view = view;
    }
}