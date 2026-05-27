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
            while (userSelectedNumber % 1 == 0){
                
                if (userSelectedNumber <= 10 && userSelectedNumber >= 0) {
                    System.out.println("Ok the vaidation works");
                    Scanner.close(); 
                
                
                
                
                
                }else {
                    System.out.println("Error!: Please Enter a positive whole number in the range of 0-10");
                }  
            }
    
        }
    }


         
 

