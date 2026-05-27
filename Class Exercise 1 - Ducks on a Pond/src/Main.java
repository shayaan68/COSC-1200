// Name: Shayaan Shah
// Date: May 21st 2026
// File Name: Class Exercise 1: Ducks on a Pond
// Description: Create a Java program that determines the amount of rubber ducks  that would fit in one pools of an area that the user sets

import java.util.Scanner;
public class Main {  
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
  

        //user input
        System.out.println("Hi! Welcome to the Duck Pool Caculator");
           
        System.out.print("Please enter a Length for the pool in Meters "); 
            double poolLength = Scanner.nextInt();
        
        System.out.print("Please enter a Width for the pool in Meters "); 
            double poolWidth = Scanner.nextInt();
        
        
        //the duck is 25cm worth of area
        double duckArea = 0.25; 
        
        //this is for cacualting the measuments of the pool
        double totalPoolArea = poolLength * poolWidth; 
        
        //caculating the amount of ducks that can fit in the pools area via dividing the pool area by 1 ducks surface area (25cm)
        double totalPoolDucks = totalPoolArea / duckArea;

        Scanner.close();
        
        System.out.printf("The total amount of ducks that can fit in a %.2f", totalPoolArea);
        System.out.printf(" m pool is %.2f ", totalPoolDucks); 
        
    }
}
