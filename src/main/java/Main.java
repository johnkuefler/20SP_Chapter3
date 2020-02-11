


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jkuefler
 */
public class Main {

    public static void main(String[] args) {
        
        String yourName = "bob";
        
        switch (yourName) {
            
            case "ruth":
                System.out.println("Your name is ruth");
                break;
            case "john":
                // print
                break;
            case "bob":
                // this one would hit
                break;
            default:
                // this happens no matter what
            
        }
        
        
        
        
        Scanner keyboard = new Scanner(System.in);
               
        // valid OR check
        String myName = "John";
        // not valid!
        if (myName.equalsIgnoreCase("john") || myName.equals("Bob") || myName.equals("Tom")) {
            // you have a cool name
            System.out.println("You have a cool  name");
        }       
        
        
        
        System.out.println("Please enter a number");
        int x = keyboard.nextInt();
        if (x > 5 && x < 10) {
            
        }
        
        // this one is always true!
        if (x > 5 || x < 10) {
            
        }
  
        
        
        if (!(x>5)) {
            // x is less than 5
        }
        
        if (x > 5) {
            if (x > 10) {
                System.out.println("x is greater than 5 and 10");
            } else {
                System.out.println("x is greater than 5 and less thatn or equal to 10");
            }
        } else if (x==5) {
            System.out.println("x is equal to 5");
        }
        else {
            System.out.println("x is not greater than 5");
        }

        // example of a flag
        boolean highScore = false;

        if (highScore == false) {
            // do something
        }

    }
}
