package com.company;

import java.util.Scanner;

public class Person {


    Scanner sr = new Scanner(System.in);
    String surnamemuchie56850 , firstNamerobert56850, street56850 , city56850;
    int zipCode56850;

    void Initialize(){
        System.out.println("Please enter your Name: ");
        firstNamerobert56850 = sr.nextLine();
        System.out.println("Please enter your Surname: ");
        surnamemuchie56850 = sr.nextLine();
        System.out.println("Please enter your Street name: ");
        street56850 = sr.nextLine();
        System.out.println("Please enter your City: ");
        city56850 = sr.nextLine();
        System.out.println("Please enter your Zip Code: ");
        zipCode56850 = sr.nextInt();
    }

    void printData(){
        System.out.println("Name: "+ firstNamerobert56850);
        System.out.println("Surname: "+ surnamemuchie56850);
        System.out.println("Street Name: "+ street56850);
        System.out.println("City: "+ city56850);
        System.out.println("Zip Code: "+ zipCode56850);
    }

}


class Staff extends com.company.Person {
    String education , Position;
    void Initialize1(){
        Initialize();
        System.out.println("Enter your Education: ");
        education = sr.nextLine();
        System.out.println("Enter your Position");
        Position = sr.nextLine();
    }

    void Print1(){
        printData();
        System.out.println("Education: " + education);
        System.out.println("Position: "+ Position);
    }

}

class Main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.Initialize1();
        employee.Print1();
    }
}
