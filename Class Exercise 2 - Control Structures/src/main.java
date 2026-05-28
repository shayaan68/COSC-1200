// Name: Shayaan Shah
// Date: May 27st 2026
// File Name: Class Exercise 2: NumberGuessing
// Description: Create a Java program that preselects a random number then asks the user for input to guess it.


import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        //user input and validation 
        System.out.println("Hello, Welcome to the number guesser!");
        System.out.print("Please enter a guess for the number that was randomly selected:"); 
        int generatedNumberAnswer = (int) Math.random() * 100 + 1;
        
        int userSelectedNumber = 0;
            while (userSelectedNumber != generatedNumberAnswer){
                System.out.print("Please enter a guess for the number that was randomly selected:"); 
                userSelectedNumber = Scanner.nextInt();{
                    if (userSelectedNumber > 100 || userSelectedNumber < 1 || userSelectedNumber % 1 != 0) {
                        System.out.println("ERROR:Please enter a Numeric whole number in  the range of 1-100");
                    
                    } else {
                        
                        if (userSelectedNumber > generatedNumberAnswer) {
                            System.out.print("You guessed: ");
                            System.out.print(userSelectedNumber);
                            System.out.print("and the answer was: ");
                            System.out.print(generatedNumberAnswer);

                            }else { 
                                System.out.print(generatedNumberAnswer);
                                System.out.print(userSelectedNumber);

                            }
                    

                        } 
                        
                    }
                    
                
                }
            }
        }
    
                    
                
                       


         
 

