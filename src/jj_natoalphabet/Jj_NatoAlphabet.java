/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jj_natoalphabet;


import java.util.Scanner; 
import java.util.Arrays; 

/**
 *
 * @author jjohnson8
 */
public class Jj_NatoAlphabet {


    public void displayQuestion (String letters, String codes, int letterPrompt){
        
        System.out.println("Alright then let's go!");
        System.out.println(); 
 
        
    }

    public static int arrayCompare(String userAnswer, String codes[], 
                                   int correctAnswer, double letterPrompt) {
        
        if (userAnswer.equals(codes[(int)letterPrompt])) 
        
        {
              correctAnswer = 0; 
            
        } else {
               correctAnswer = 1; 
               }
        
        return correctAnswer; 
        }
    
    public static void main(String[] args) {
        
     // Set variables 
    
    String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
    "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    
    String[] codes = {"Alpha", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", 
                                           "Gulf", "Hotel", "India", "Juliette",
                      "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", 
                      "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", 
                      "Whiskey", "X-Ray", "Yankee", "Zulu"};
    
    Scanner stndin = new Scanner(System.in);
    
    double letterPrompt =0;
    String userAnswer ;
    double userInput = 0;
    int correctAnswer =0;   
    int count=1;
    String cB; 
    
     // Ask user if they want to play 
    System.out.println("Would you like to play the Nato Alphabet Learning Game?");
    System.out.println("");
    System.out.println("Press 1 for yes and 2 for no");
    
     // Process user response - 1 for yes 2 for no 
    
    userInput = stndin.nextDouble(); 

// utilize array for both letter and corresponding word then implement the logic below 
    
            if(userInput == 1){

               do {

                   letterPrompt = Math.random(); 
                   letterPrompt = letterPrompt*26; 


                   System.out.println("Question number " + count); 

                   System.out.println("Enter the code for the letter " + letters[(int)letterPrompt]); 

                   cB = stndin.nextLine(); 
                   userAnswer= stndin.nextLine(); 

                   System.out.println();
                   

                  correctAnswer = arrayCompare(userAnswer,codes,correctAnswer, letterPrompt); 

                   if (correctAnswer == 0) {

                       System.out.println("You got it correct"); 

                    } else 
                        {
                            System.out.println("Your answer was not correct");
                            System.out.println("The correct answer is " + codes[(int)letterPrompt]); 
                            System.out.println("You answered " + userAnswer);
                        }

                   System.out.println("Would you like to play again? Press 1 for yes 2 for no"); 

                   userInput = stndin.nextInt( ); 
                   count = count+1; 

                } while(userInput == 1);
        }
    }     
}

