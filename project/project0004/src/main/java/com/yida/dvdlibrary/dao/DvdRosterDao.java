/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yida.dvdlibrary.dao;

import com.yida.dvdlibrary.dto.Dvd;
import java.util.List;


public interface DvdRosterDao {
    /**
     * Adds the given Student to the roster and associates it with the given 
     * dvd id. If there is already a dvd associated with the given 
     * dvd id it will return that dvd object, otherwise it will 
     * return null.
     * 
     * @param dvdID id with which dvd is to be associated
     * @param dvd dvd to be added to the roster
     * @return the Dvd object previously associated with the given  
 dvd id if it exists, null otherwise
     * @throws DvdRosterDaoException
     */
    Dvd addDvd(String dvdID, Dvd dvd)
     throws DvdRosterDaoException;

    /**
     * Returns a List of all Students on the roster. 
     * 
     * @return Dvd List containing all students on the roster.
     * @throws DvdRosterDaoException
     */
    List<Dvd> getAllDvDs()
     throws DvdRosterDaoException;

    /**
     * Returns the dvd object associated with the given dvd id.
     * Returns null if no such dvd exists
     * 
     * @param dvdID ID of the dvd to retrieve
     * @return the Dvd object associated with the given dvd id,  
 null if no such dvd exists
     * @throws DvdRosterDaoException
     */
    Dvd getDvd(String dvdID)
     throws DvdRosterDaoException;

    /**
     * Removes from the roster the dvd associated with the given id. 
     * Returns the dvd object that is being removed or null if 
     * there is no dvd associated with the given id
     * 
     * @param dvdID id of dvd to be removed
     * @return Dvd object that was removed or null if no dvd 
 was associated with the given dvd id
     * @throws DvdRosterDaoException
     */
    Dvd removeDvd(String dvdID)
     throws DvdRosterDaoException;
}