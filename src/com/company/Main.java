package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //This program check the perimeter and area of various classrooms at Grand Circus based on user input.
        Scanner scanner = new Scanner(System.in);

        double area;
        double perimeter;
        double length;
        double width;
        char = userChar = 'n';

        while (userChar != 'n'){

        System.out.println("Enter Length:");
        System.out.println("Enter Width:");

        length = scanner.nextDouble();
        width = scanner.nextDouble();


        area =  length * width;
        perimeter = (2 * length + 2 * width);

        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);



    }
}
