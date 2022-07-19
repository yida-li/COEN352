package com.yida.project0002.util;
import java.util.Scanner;
/**
 *
 * @author nakamoto
 */

public class util {
        public void calculate(){
        double currentBalance, interestRate, updatedBalance;
        int divisor = 1;
        int i, j, numYears, method;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How much do you want to invest? ");
        currentBalance = Double.parseDouble(in.nextLine());
        
        System.out.print("How many years are investing? ");
        numYears = Integer.parseInt(in.nextLine());
        
        System.out.print("What is the annual interest rate % growth? ");
        interestRate = Double.parseDouble(in.nextLine());
        
        System.out.println("How would you like interest compounded");
        System.out.println("1) Quarterly   2) Monthly   3) Daily");
        method = Integer.parseInt(in.nextLine());
            switch (method) {
                case 1:
                    divisor = 4;
                    break;
                case 2:
                    divisor = 12;
                    break;
                default:
                    divisor = 365;
                    break;
            }
        
        interestRate /= divisor;
        System.out.println();
        
        for(i = 1; i <= numYears; i++){
            updatedBalance = currentBalance;
            for(j = 0; j < divisor; j++){
                updatedBalance *= (1+(interestRate/100));
            }
            
            System.out.println("Year " + i + ":");
            System.out.println("Began with $" + currentBalance);
            System.out.println("Earned $" + (updatedBalance -currentBalance));
            System.out.println("Ended with $" + updatedBalance);
            System.out.println();
            currentBalance = updatedBalance;
        }
    }
}
