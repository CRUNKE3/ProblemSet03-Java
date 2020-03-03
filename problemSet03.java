/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.problemset03;

import java.util.Scanner;

/**
 *
 * @author dczernikowski1
 */
public class problemSet03 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is my name?");
	String name = sc.next();
        System.out.println("Input a number!");
	int age = sc.nextInt();
        System.out.println("Input a noun!");
	String interest1 = sc.next();
        System.out.println("Input another noun!");
	String interest2 = sc.next();
        System.out.println("Input an adjective!");
	String adjective1 = sc.next();
        System.out.println("Input another adjective!");
	String adjective2 = sc.next();
        System.out.println("Input a noun!");
	String noun1 = sc.next();
        System.out.println("Input a number with a deecimal!");
	double grossPrice = sc.nextDouble();
	double tax = 1.06625;
	int netPrice = (int) (grossPrice*tax);
        System.out.println("Input a number!");
	int number1 = sc.nextInt();
	int oldCollection = number1++;
        System.out.println("What do you like to collect?");
	String myInterest = sc.next();
		
		
	System.out.println("Hi, my name is " + name + "! I am " + age + " years old and I really like " + interest1 + "s "
	+ "and " + interest2 + "s. Yesterday was really " + adjective1 + " because I bought a " + adjective2 + " " + 
	noun1 + " for " + grossPrice + " but with tax it was actually $" + netPrice + ". Fortunately, I have " + 
	oldCollection + " " + noun1 + "s and I now have " + number1 + " " + noun1 + "s in total! What do you " +
	"like to collect? " + myInterest);
	sc.close();
	
    }
}
