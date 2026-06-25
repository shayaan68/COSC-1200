// Name: Shayaan Shah
// Date: June 17th 2026
// File Name: Class - Projectiles Motion
// Description: Creating a class that does all the caculations and then importing that class in another Java class file that displays the user input and the output of the caculations of the first java file
import java.util.Scanner;
public class NumberTools {
    public static void main(String[] args) throws Exception {
        Scanner Scan = new Scanner(System.in);
        
        //Declaring the variables for each of the caculations
        int isEven = 0;
        //isEven(int value): 
        // A function that will return true 
        // if its parameter is evenly divisible by 2, 
        // and return false otherwise.
        
        int isSingleDigit = 0; 
        //isSingleDigit(int value): 
        // A function that will return true 
        // if its parameter is between -9 and 9, 
        // and return false otherwise.
        
        int isSquare = 0;
        //isSquare(int value): 
        // A function that will return true if its parameter is a square number 
        // (e.g. the result of an integer squared, or has an integer square root), 
        // and return false otherwise.
        
        int isMultipleOfTen;
        //isMultipleOfTen(int value): A function that will return true 
        // if its parameter is a multiple of 10 (e.g. 10, 20, 40, …), and return false otherwise. 
        // (You could also genericize it into isMultiple() to work with any multiple!)

            if (isEven % 2 == 0) {
            System.out.println("YES! Your inputed number was a even number!");
            } else {
                System.out.println("NO! Your inputed number was an odd number!");
            isEven = Scan.nextInt();
            
            
            if (isSingleDigit >= -9 && isSingleDigit <=9); {
            System.out.println("YES! Your inputed number was in between -9 and 9!");
            } else {
                System.out.println("Error! please enter a whole number");}
            isSingleDigit = Scan.nextInt();
            
            
            int isSquarecheck = (int) Math.sqrt(isSquare);
            if (isSquare * isSquare == isSquarecheck); {
                System.out.println("YES! Your number is a perfect Square!");
            } else {
                System.out.println("NO! Your number is not a perfect square");
            }
        
        }
        }
        }
        



