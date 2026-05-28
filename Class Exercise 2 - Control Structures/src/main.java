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
        int generatedNumberAnswer = (int) (Math.random() * 100)  + 1;
        
        int userSelectedNumber = 0;
            //This is to set the loop that while the user genrated number and the number that was generated are not the same, 
            // the code will loop itself till it is. It also will be easier to count how many times this statement held true so that the attempts can be counted easier.        
            while (userSelectedNumber != generatedNumberAnswer){ 
                userSelectedNumber = Scanner.nextInt();{
                    
                    //Error vaildation to check for both negitives, and invaild range 
                    if (userSelectedNumber < 1 || userSelectedNumber > 100) {
                        System.out.println("ERROR:Please enter a Numeric whole number in  the range of 1-100");
                    
                    
                    //the first 2 else if are for if the user inputed vailded input 
                    // but did not have the same answer as the genratred number which then thy will be prompted to try again
                    }else if (userSelectedNumber > generatedNumberAnswer) {
                        System.out.print("You guessed: ");
                        System.out.print(userSelectedNumber);
                        System.out.print("you were incorrect since your answer was too high, Try guessing again!: ");
                    }else if (userSelectedNumber < generatedNumberAnswer) {
                        System.out.print("You guessed: ");
                        System.out.print(userSelectedNumber);
                        System.out.print(" you were incorrect since your answer was too low Try guessing again!:");

                        //where the user input would land if its both vaild and the same amount as the genratedNumberAnswer
                    }else if (userSelectedNumber == generatedNumberAnswer) {
                        System.out.print("You guessed: ");
                        System.out.print(userSelectedNumber);
                        System.out.print("and the answer was: ");
                        System.out.print(generatedNumberAnswer);
                        System.out.print("That means you are correct!");
                        System.out.print("And it only took you");
                        Scanner.close();
                    }else {
                       Scanner.hasNextInt();
                        System.out.print("You inputted invaild input, please enter a postiive whole numer in the range of 1-100");
                    }   
                        }
                    } 
                }  
                }
                
            
            
        
                
            
                    


        


