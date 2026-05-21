// Name: Shayaan Shah
// Date: May 21st 2026
// File Name: Class Exercise 1: Ducks on a Pond
// Description: Create a Java program that determines the circumriance of how many duckls would fit in 2 pools of an equal size

import java.util.Scanner;
public class Main {  
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        //decleartion

        int poolLength;
        int poolWidth;
        int duckArea = ; //its 25cm worth of area
        int totalPoolArea = poolLength * poolWidth * 2; //this is for cacualting the measuments of both pools
        int totalPoolDucks = (totalPoolArea / duckArea );
        
        System.out.print("Hi! Welcome to the Duck Pool Caculator");
           
        System.out.print("Please enter a length for the pool in Meters "); 
            int poolLength = Scanner.nextInt();

        System.out.print("Please enter a Width for the pool in Meters "); 
            int poolWidth = Scanner.nextInt();

        

        Scanner.close();
        
        
        
    }
}
