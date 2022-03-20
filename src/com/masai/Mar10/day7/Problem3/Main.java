package com.masai.Mar10.day7.Problem3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

        System.out.println("Welcome to Student details Section ");
        System.out.println("=====================================");

        System.out.println("Please Enter the Student Roll Number");
        int rollNo = sc.nextInt();

        System.out.println("Please Enter the Student Name");
        String stdName = sc.next();

        System.out.println("Please Enter Student Mark");
        int stdMark  = sc.nextInt();


        System.out.println("--------------------------------------");
        Bean Student  =  new Bean();
        Student.setRollNumber(rollNo);
        Student.setStudentName(stdName);
        Student.setMarks(stdMark);

//        System.out.println("--------------------------------------");
        System.out.println("Student RollNumber is : "+Student.getRollNumber());
        System.out.println("Student Name is       : "+Student.getStudentName());
        System.out.println("Student Marks         : "+Student.getMarks());



    }
}
