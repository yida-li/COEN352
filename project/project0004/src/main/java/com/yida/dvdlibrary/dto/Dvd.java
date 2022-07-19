/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yida.dvdlibrary.dto;


public class Dvd {
    
    private String releasingDate;
    private String userNotes;
    private String theTitle;
    private String directorName;
    private String studioName;
    private String mpaaRating;
   

    public Dvd(String dvd) {
        this.theTitle = dvd;
    }

    public String getReleasingDate() {
        return releasingDate;
    }

    public void setReleasingDate(String releasingDate) {
        this.releasingDate = releasingDate;
    }


    

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }    


    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }
    
    
    public String getUserNotes() {
        return userNotes;
    }

    public void setUserNotes(String userNotes) {
        this.userNotes = userNotes;
    }

    public String getTheTitle() {
        return theTitle;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }   
}