/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yida.dvdlibrary.ui;

import com.yida.dvdlibrary.dto.Dvd;

import java.util.List;

public class DvdRosterView {

    private UserIO io;

    public DvdRosterView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Display all DVD on collection");
        io.print("2. Create new DVD from collection");
        io.print("3. View Info on particular DVD");
        io.print("4. Remove a DVD");
        io.print("5. Update info on a particular DVD");
        io.print("6. Exit");
        return io.readInt("Please select from the above choices.", 1, 6);
    }

    public Dvd getOldDvDInfo1() {
        String newTitle = io.readString("Please enter the Title");
        String releaseDate = io.readString("Please enter the Release Date");

        String mpaaRating = io.readString("Please enter the MPAA rating");
        String directorName = io.readString("Please enter the Director's name");
        String titleName = io.readString("Please enter the Studio");
        String userNotes = io.readString("Please enter the user rating or notes");

        Dvd currentDvd = new Dvd(newTitle);
        currentDvd.setReleasingDate(releaseDate);
        currentDvd.setUserNotes(userNotes);
        currentDvd.setDirectorName(directorName);
        currentDvd.setStudioName(titleName);
        currentDvd.setMpaaRating(mpaaRating);
        return currentDvd;
    }

    public Dvd getOldDvdInfo2() {
        String newTitle = io.readString("Please edit the Title");
        String releaseDate = io.readString("Please edit the Release Date");

        String mpaaRating = io.readString("Please edit the MPAA rating");
        String directorName = io.readString("Please edit theDirector's name");
        String titleName = io.readString("Please edit the Studio");
        String userNotes = io.readString("Please edit the user rating or notes");

        Dvd currentDvd = new Dvd(newTitle);
        currentDvd.setReleasingDate(releaseDate);
        currentDvd.setUserNotes(userNotes);
        currentDvd.setDirectorName(directorName);
        currentDvd.setStudioName(titleName);
        currentDvd.setMpaaRating(mpaaRating);
        return currentDvd;
    }

    public void displayCreateStudentBanner() {
        io.print("=== Create DVD ===");
    }

    public void displayCreateSuccessBanner() {
        io.readString(
                "DVD successfully created.  Please hit enter to continue");
    }

    public void displayDvdList(List<Dvd> xList) {
        for (Dvd currentDvd : xList) {
            String studentInfo = String.format(" Dvd Title :%s\n Release Date :%s\n "
                    + "MPAA rating :%s\n Director's name :%s\n Studio :%s\n User Rating :%s\n",
                    currentDvd.getTheTitle(),
                    currentDvd.getReleasingDate(), currentDvd.getMpaaRating(),
                    currentDvd.getDirectorName(), currentDvd.getStudioName(), currentDvd.getUserNotes());
            io.print(studentInfo);
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All DVD ===\n\n");
    }

    public void displayDisplayDvDBanner() {
        io.print("=== Display DVD ===\n\n");
    }

    public String getTitleChoice() {
        return io.readString("Please enter the Title.");
    }

    public void displayDvd(Dvd dvd) {
        if (dvd != null) {
            io.print(" ");
            io.print(dvd.getTheTitle());
            io.print(dvd.getReleasingDate());

            io.print(dvd.getUserNotes());

            io.print(dvd.getDirectorName());
            io.print(dvd.getStudioName());
            io.print(dvd.getMpaaRating());
            io.print("");
        } else {
            io.print("No such Title.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void updateDvd(Dvd x) {
        if (x != null) {
            io.print(" trying to update here lad!!! \n");
            io.print(x.getTheTitle());
            io.print("");
        } else {
            io.print("No such Title.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveDvdBanner() {
        io.print("=== Remove DVD ===");
    }

    public void displayRemoveResult(Dvd studentRecord) {
        if (studentRecord != null) {
            io.print("DVD successfully removed.");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}
