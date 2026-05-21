// Name: Shayaan Shah
// Date: May 21st 2026
// File Name: Class Exercise 1: Ducks on a Pond
// Description: Create a Java program that determines the circumriance of how many duckls would fit in 2 pools of an equal size

import java.util.Scanner;
public class Main {  
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        //decleartion

        
        System.out.println("Hi! Welcome to the Duck Pool Caculator");
           
        System.out.print("Please enter a Length for the pool in Meters "); 
            double poolLength = Scanner.nextInt();

        System.out.print("Please enter a Width for the pool in Meters "); 
            double poolWidth = Scanner.nextInt();

        
        
        
        
        
        
        
        double duckArea = 0.25; //the duck is 25cm worth of area
        double totalPoolArea = poolLength * poolWidth; //this is for cacualting the measuments of the pool
        double totalPoolDucks = totalPoolArea / duckArea;

        Scanner.close();
        
        System.out.print("The "totalPoolDucks); 
        
    }
}
