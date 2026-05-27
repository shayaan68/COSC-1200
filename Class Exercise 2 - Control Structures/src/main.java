// Name: Shayaan Shah
// Date: May 27st 2026
// File Name: Class Exercise 2: NumberGuessing
// Description: Create a Java program that preselects a random number then asks the user for input to guess it.


import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        //user input and validation 
        System.out.println("Hello, Welcome to the number guesser!");
        System.out.print("Please enter a guess for the number that was randomly selected"); 
            double userSelectedNumber = Scanner.nextInt();

            if (userSelectedNumber >= 10 && userSelectedNumber >= 0); {

                System.out.println("This is to see if the if else statments work");

        } 
            else{
              System.out.println("Error! Please enter a number in between or equal to 1 or 10");
            }

        
        

        
        
        
    
        
    }
}
