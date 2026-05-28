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
        System.out.print("Please enter a guess for the number that was randomly selected:"); 
            double userSelectedNumber = Scanner.nextDouble();

                while (userSelectedNumber % 1 == 0 && userSelectedNumber > 0){
                    
                
                    if (userSelectedNumber <= 100 && userSelectedNumber >= 1) {
                        
                        
                        int generatedNumber = (int)(Math.random() * (100 - 1 + 1)) + 1;
                            System.out.println(generatedNumber);

        
                    }else {
                        System.out.println("Error!: Please enter a positive number in the RANGE of 1-100");
                        
                    }  
                } 
                System.out.println("Error!: Please Enter a POSITIVE WHOLE NUMBER in the range of 0-100");
                    
            }
    
        }



         
 

