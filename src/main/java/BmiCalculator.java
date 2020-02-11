/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author johnk
 */
public class BmiCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter weight in LBS");

        double weightInLbs = keyboard.nextDouble();

        System.out.println("Please enter height in inches");

        double heightInInches = keyboard.nextDouble();

        double bmi = weightInLbs * (703 / (heightInInches * heightInInches));

        System.out.println("Your bmi is: " + bmi);
        
        if (bmi < 18.5) {
            System.out.println("This bmi is underweight");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("This bmi is healthy");
        } else {
            System.out.println("This bmi is overweight");
        }

    }
}
