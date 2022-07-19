package com.yida.project0001;

/**
 *
 * @author nakamoto
 */
import com.yida.project0001.util.util;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        util calc = new util();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int selection = 0;
        int operand1 = 0;
        int operand2 = 0;
        while(flag == true){
            System.out.println("Calculator");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Exit");
            
            while(true){
                try{
                    System.out.print("Enter a number to select operation: ");
                    selection = Integer.parseInt(scan.nextLine());
                    if(1 <= selection && 5 >= selection){
                        break;
                    }else{
                        System.out.println("Out of range: try again");
                    }
                }catch(NumberFormatException nfe){
                    System.out.println("Not an integer: try again");
                }
            }
            if(selection != 5){
                while(true){
                    try{
                        System.out.print("Enter the first operand: ");
                        operand1 = Integer.parseInt(scan.nextLine());
                        System.out.print("Enter the second operand: ");
                        operand2 = Integer.parseInt(scan.nextLine());
                        break;
                    }catch(NumberFormatException nfe){
                        System.out.println("Not an integer: try again");
                    }
                }
            }
            
            switch (selection) {
                case 1:
                    System.out.println(operand1 + " + " + operand2 + " = " + calc.add(operand1, operand2));
                    break;
                case 2:
                    System.out.println(operand1 + " - " + operand2 + " = " + calc.subtract(operand1, operand2));
                    break;
                case 3:
                    System.out.println(operand1 + " * " + operand2 + " = " + calc.multiply(operand1, operand2));
                    break;
                case 4:
                    System.out.println(operand1 + " / " + operand2 + " = " + calc.divide(operand1, operand2));
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
        
        System.out.println("Thank you! Come again!");
        scan.close();
    }
}
