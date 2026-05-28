// Name: Shayaan Shah
// Date: May 27st 2026
// File Name: Class Exercise 2: NumberGuessing
// Description: Create a Java program that preselects a random number then asks the user for input to guess it.


import java.util.Scanner;
public class main {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        //user input and validation 
        double generatedNumberAnswer = (int) Math.random() * 100 + 1;
        
        double userSelectedNumber = -1;
                
            while(userSelectedNumber !=  generatedNumberAnswer )
                    
                    if (userSelectedNumber == generatedNumberAnswer) {
                        System.out.println(generatedNumberAnswer);
                        System.out.println(userSelectedNumber);
                                
                            } else 
                                System.out.print("Error please enter a positive numeric whole value in the range of 1-100 ");
                            {
                                Scanner.close();
                            }
                    }  
                }
            } 


         
 

