package org.example; //DO NOT DELETE

import java.util.Scanner;

public class ScannerExample {

  public static void main (String[] args) {
    double gallon;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter gallons: ");
    gallon = input.nextDouble();
    System.out.println("In" + gallon +  "gallons there are:");
    double quart = gallon * 4;
    double pint = quart * 2;
    double cup = pint * 2;
    double tablespoon = cup * 16;
    System.out.println(quart + " quarts");
    System.out.println(pint + " pints");
    System.out.println(cup + " cups");
    System.out.println(tablespoon + " tablespoons");

  }
}