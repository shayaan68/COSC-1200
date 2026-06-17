// Name: Shayaan Shah
// Date: June 17th 2026
// File Name: Class - Projectiles Motion
// Description: Creating a class that does all the caculations and then importing that class in another Java class file that displays the user input and the output of the caculations of the first java file

import java.util.Scanner;
public class NumberTools {
    public static void main(String[] args) throws Exception {
        
        //Declaring the variables for each of the caculations
        int isEven = 0;
        //isEven(int value): A function that will return true 
        // if its parameter is evenly divisible by 2, 
        // and return false otherwise.
        
        int isSingleDigit = 0; 
        //isSingleDigit(int value): A function that will return true 
        // if its parameter is between -9 and 9, 
        // and return false otherwise.
        
        int isPowerOfTwo;
        //isPowerOfTwo(int value): A function that will return true 
        // if its parameter is a power of 2 (e.g. 2, 4, 8, 16, 32…), and return false otherwise. 
        // (You could also genericize it into isPower() 
        // to work with any base value!)
        
        int isMultipleOfTen;
        //isMultipleOfTen(int value): A function that will return true 
        // if its parameter is a multiple of 10 (e.g. 10, 20, 40, …), and return false otherwise. 
        // (You could also genericize it into isMultiple() to work with any multiple!)


        while (isEven % 2 == 0) {
            System.out.print("Your inputed number was a even number!");
            if (isEven % 2 != 0) {
                System.out.print("Your inputed number was an odd number!");
            } else {
                System.out.print("Error! please enter a whole number");}

        while (isSingleDigit >= -9 && isSingleDigit <=9); {
            System.out.print("Your inputed number was in between -9 and 9!");
            if (isSingleDigit < -9 || isSingleDigit > 9) {
                System.out.print("Your inputed number was an odd number!");
            } else {
                System.out.print("Error! please enter a whole number");}
        
        while (isPowerOfTwo % 2 == 0 ); {
            System.out.print("Your inputed number was a square root of 2!");
            if (isPowerOfTwo % 2 !=0 ) {
                System.out.print("Your inputed number was not a power!");
            } else {
                System.out.print("Error! please enter a whole number");}
        
        

        }
        }
        }
        }

