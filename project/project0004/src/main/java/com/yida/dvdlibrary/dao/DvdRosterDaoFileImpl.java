/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yida.dvdlibrary.dao;

import com.yida.dvdlibrary.dto.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DvdRosterDaoFileImpl implements DvdRosterDao {

    public static final String ROSTER_FILE = "dvd.txt";
    public static final String DELIMITER = "::";
    private Map<String, Dvd> dvds = new HashMap<>();

    @Override
    public Dvd addDvd(String dv, Dvd dvd)
            throws DvdRosterDaoException {
        loadRoster();
        Dvd oldDvd = dvds.put(dv, dvd);
        writeRoster();
        return oldDvd;
    }

    @Override
    public List<Dvd> getAllDvDs()
            throws DvdRosterDaoException {
        loadRoster();
        return new ArrayList<Dvd>(dvds.values());
    }

    @Override
    public Dvd getDvd(String dv)
            throws DvdRosterDaoException {
        loadRoster();
        return dvds.get(dv);
    }

    @Override
    public Dvd removeDvd(String dv)
            throws DvdRosterDaoException {
        loadRoster();
        Dvd removedStudent = dvds.remove(dv);
        writeRoster();
        return removedStudent;
    }

    private Dvd unmarshallDvd(String dvdText) {

        String[] dvdToken = dvdText.split(DELIMITER);
        String dv = dvdToken[0];
        Dvd dvdFromFile = new Dvd(dv);
        dvdFromFile.setReleasingDate(dvdToken[1]);
        dvdFromFile.setUserNotes(dvdToken[5]);
        dvdFromFile.setDirectorName(dvdToken[3]);
        dvdFromFile.setStudioName(dvdToken[4]);
        dvdFromFile.setMpaaRating(dvdToken[2]);
        return dvdFromFile;
    }

    private void loadRoster() throws DvdRosterDaoException {
        Scanner scanner;

        try {
            // Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvdRosterDaoException(
                    "-_- Could not load roster data into memory.", e);
        }

        String currentLine;

        Dvd dvdNode;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            dvdNode = unmarshallDvd(currentLine);
            dvds.put(dvdNode.getTheTitle(), dvdNode);
        }
        // close scanner
        scanner.close();
    }

    private String marshallDvd(Dvd dv) {

        String dvdText = dv.getTheTitle() + DELIMITER;
        dvdText += dv.getReleasingDate() + DELIMITER;
        dvdText += dv.getMpaaRating() + DELIMITER;
        dvdText += dv.getDirectorName() + DELIMITER;
        dvdText += dv.getStudioName() + DELIMITER;
        dvdText += dv.getUserNotes();
        return dvdText;
    }

    /**
     * Writes all dvds in the roster out to a ROSTER_FILE. See loadRoster
     * for file format.
     *
     * @throws DvdRosterDaoException if an error occurs writing to the file
     */
    private void writeRoster() throws DvdRosterDaoException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new DvdRosterDaoException(
                    "Could not save dvd data.", e);
        }

        String dvdText;
        List<Dvd> studentList = this.getAllDvDs();
        for (Dvd dvdNode : studentList) {
            // turn a Dvd into a String
            dvdText = marshallDvd(dvdNode);
            // write the Dvd object to the file
            out.println(dvdText);
            // force PrintWriter to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
    }

}
