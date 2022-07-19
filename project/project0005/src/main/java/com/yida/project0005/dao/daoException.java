/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yida.project0005.dao;


public class daoException extends Exception{
    
    public daoException(String message) {
        super(message);
    }
    
    public daoException(String message, Throwable cause) {
        super(message, cause);
    }
    
}