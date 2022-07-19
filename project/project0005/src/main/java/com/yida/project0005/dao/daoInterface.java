
package com.yida.project0005.dao;

import com.yida.project0005.dto.Student;
import java.util.List;

/**
 *
 * @author yida
 */
public interface daoInterface {
    /**
     * Adds the given Student to the roster and associates it with the given 
     * student id. If there is already a student associated with the given 
     * student id it will return that student object, otherwise it will 
     * return null.
     * @version
     * @param studentId id with which student is to be associated
     * @param student student to be added to the roster
     * @return the Student object previously associated with the given  
     * student id if it exists, null otherwise
     * @throws daoException
     */
    Student addStudent(String studentId, Student student)
     throws daoException;

    /**
     * Returns a List of all Students on the roster. 
     * 
     * @return Student List containing all students on the roster.
     * @throws daoException
     */
    List<Student> getAllStudents()
     throws daoException;

    /**
     * Returns the student object associated with the given student id.
     * Returns null if no such student exists
     * 
     * @param studentId ID of the student to retrieve
     * @return the Student object associated with the given student id,  
     * null if no such student exists
     * @throws daoException
     */
    Student getStudent(String studentId)
     throws daoException;

    /**
     * Removes from the roster the student associated with the given id. 
     * Returns the student object that is being removed or null if 
     * there is no student associated with the given id
     * 
     * @param studentId id of student to be removed
     * @return Student object that was removed or null if no student 
     * was associated with the given student id
     * @throws daoException
     */
    Student removeStudent(String studentId)
     throws daoException;
}