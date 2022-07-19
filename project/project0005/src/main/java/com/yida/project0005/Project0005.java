package com.yida.project0005;

/**
 *
 * @author nakamoto
 */
import com.yida.project0005.controller.controller;
import com.yida.project0005.dao.daoImplement;
import com.yida.project0005.ui.view;
import com.yida.project0005.ui.ioImplement;
import com.yida.project0005.dao.daoInterface;
import com.yida.project0005.ui.ioInterface;


public class Project0005 {
    public static void main(String[] args) {
    
    // interface object   
    ioInterface myIo = new ioImplement();
    
    // view object initialized with interface object as a parameter
    view myView = new view(myIo);
    
    // dao object
    daoInterface myDao = new daoImplement();
    
    // controller object initialized with dao / view
    controller controller = new controller(myDao, myView);
    
    // start 
    controller.run();
}
}