package com.company;

import java.util.Scanner;

//This program checks the perimeter, area and volume of various classrooms at Grand Circus based on user input.
/*Prompt the user to enter values for L & W
Get user input
Calculate area and perimeter
Display area and perimeter
Ask if the user wants to continue
 */

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
//declares variables
        double area;
        double perimeter;
        double length;
        double width;
        double height;
        double volume;
        char userChar = 'y';

//Loops program
        while (userChar == 'y') {

//prompts for user input
            System.out.println("Enter Length:");

            while (!scanner.hasNextDouble()) {
                System.out.println("Your input needs to be a in the following format ex: 25.0 ");
                scanner.nextLine();
            }
            length = scanner.nextDouble();

            System.out.println("Enter Width:");

            while (!scanner.hasNextDouble()) {
                System.out.println("Your input needs to be a in the following format ex: 25.0 ");
                scanner.nextLine();
            }
                width = scanner.nextDouble();

//capture user input for height
                System.out.println("Enter Height:");

                while (!scanner.hasNextDouble()) {
                    System.out.println("Your input needs to be a in the following format ex: 25.0 ");
                    scanner.nextLine();
                }
                    height = scanner.nextDouble();

//calculates area, perimeter and volume.
                    area = length * width;
                    perimeter = 2 * (length + width);
                    volume = length * height * width;

//Prints area and perimeter
                    System.out.println("Area:" + area);
                    System.out.println("Perimeter:" + perimeter);
                    System.out.println("Height:" + volume);
//clears the scanner
                    scanner.nextLine();
//prompts if the user wants to find the area of another room
                    System.out.println("Continue? (y/n)");
                    userChar = scanner.next().charAt(0);
                    
                }

                System.out.println("Goodbye.");
            }
        }
