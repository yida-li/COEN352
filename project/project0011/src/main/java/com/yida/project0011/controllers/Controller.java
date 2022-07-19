/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yida.project0011.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


@RestController
@RequestMapping("/api")
public class Controller {

    List<Integer> list=new ArrayList<Integer>();
    public static String[] result = {"Hello", "World", "!"};    
    @GetMapping
    public String[] helloWorld() {
        
        return result;
    }

    @PutMapping("/insert")
    public String insert(String operand1) {

        int length_Var = result.length; //Defining the array length variable  
        
        //define new array with extended length           
        String[] newArray = new String[ length_Var + 1 ];  
        //Adding all the elements to initial Array  
        for (int i=0; i <result.length; i++)  
        {  
            newArray[i] = result [i];  
         }  
        //Specifying the position of the added elements ( Last)  
        newArray[newArray.length- 1] = operand1;  
        //make it original and print  
        result = newArray;
        
        return String.format("%s is added", operand1);
    }
    @PostMapping("/calculate")
    public String calculate(int operand1, String operator, int operand2) {
        int result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                String message = String.format("operator '%s' is invalid", operator);
                throw new IllegalArgumentException(message);
        }
        return String.format("%s %s %s = %s", operand1, operator, operand2, result);
    }
    
    @DeleteMapping("/delete")
    public String delete(String operand1) 
    {

        List<String> list = new ArrayList<String>(Arrays.asList(result));
        list.remove(operand1);
        result = list.toArray(new String[0]);
        return String.format("%s is deleted", operand1);
    }
}