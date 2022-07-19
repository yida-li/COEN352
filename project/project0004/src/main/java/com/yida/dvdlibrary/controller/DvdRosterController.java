
package com.yida.dvdlibrary.controller;

import com.yida.dvdlibrary.dao.DvdRosterDaoException;
import com.yida.dvdlibrary.dao.DvdRosterDaoFileImpl;
import com.yida.dvdlibrary.dto.Dvd;
import com.yida.dvdlibrary.ui.DvdRosterView;
import com.yida.dvdlibrary.ui.UserIO;
import com.yida.dvdlibrary.ui.UserIOConsoleImpl;
import java.util.List;
import com.yida.dvdlibrary.dao.DvdRosterDao;


public class DvdRosterController {
    
  
    private UserIO io = (UserIO) new UserIOConsoleImpl();
     private DvdRosterView view;
      private DvdRosterDao dao;
  public void run() {
    boolean keepGoing = true;
    int menuSelection = 0;
    try {
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listDvd();
                    break;
                case 2:
                    createDvd();
                    break;
                case 3:
                    viewDvd();
                    break;
                case 4:
                    removeDvd();
                    break;
                case 5:
                    updateDvd();
                    break;                   
                case 6:
                    keepGoing = false;
                    break;                     
                default:
                    unknownCommand();
            }

        }
        exitMessage();
    } catch (DvdRosterDaoException e) {
        view.displayErrorMessage(e.getMessage());
    }
}

   private int getMenuSelection() {
    return view.printMenuAndGetSelection();
}
private void createDvd() throws DvdRosterDaoException {
    view.displayCreateStudentBanner();
    Dvd newDvd = view.getOldDvDInfo1();
    dao.addDvd(newDvd.getTheTitle(), newDvd);
    view.displayCreateSuccessBanner();
}
  private void listDvd() throws DvdRosterDaoException {
    view.displayDisplayAllBanner();
    List<Dvd> dvdList = dao.getAllDvDs();
    view.displayDvdList(dvdList);
}
   private void viewDvd() throws DvdRosterDaoException {
    view.displayDisplayDvDBanner();
    String newTitle = view.getTitleChoice();
    
    
    Dvd d = dao.getDvd(newTitle);
    
    
  
    view.displayDvd(d);
}

  private void updateDvd() throws DvdRosterDaoException {
    view.displayDisplayDvDBanner();
    String newTitle = view.getTitleChoice();
    Dvd removedDvd = dao.removeDvd(newTitle);
    Dvd newDvd = view.getOldDvdInfo2();
    dao.addDvd(newDvd.getTheTitle(), newDvd);
    
    
    
} 
   
private void removeDvd() throws DvdRosterDaoException {
    view.displayRemoveDvdBanner();
    String newTitle = view.getTitleChoice();
    Dvd removedDvd = dao.removeDvd(newTitle);
    view.displayRemoveResult(removedDvd);
}

private void unknownCommand() {
    view.displayUnknownCommandBanner();
}

private void exitMessage() {
    view.displayExitBanner();
}
   public DvdRosterController(DvdRosterDao dao, DvdRosterView view) {
    this.dao = dao;
    this.view = view;
    }
}