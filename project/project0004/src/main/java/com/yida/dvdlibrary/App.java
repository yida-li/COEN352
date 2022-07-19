/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yida.dvdlibrary;

import com.yida.dvdlibrary.controller.DvdRosterController;
import com.yida.dvdlibrary.dao.DvdRosterDaoFileImpl;
import com.yida.dvdlibrary.ui.DvdRosterView;
import com.yida.dvdlibrary.ui.UserIO;
import com.yida.dvdlibrary.ui.UserIOConsoleImpl;
import com.yida.dvdlibrary.dao.DvdRosterDao;

public class App {
   public static void main(String[] args) {
    UserIO myIo = new UserIOConsoleImpl();
    DvdRosterView myView = new DvdRosterView(myIo);
    DvdRosterDao myDao = new DvdRosterDaoFileImpl();
    DvdRosterController controller =
            new DvdRosterController(myDao, myView);
    controller.run();
}
}
