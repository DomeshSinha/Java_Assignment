package com.masai.Mar10_day7.Problem2;
import java.util.Scanner;

class Main {
    public static String reversString(String input){
//write the logic
        char[] ans = input.toCharArray();

        StringBuilder  output = new StringBuilder();

        for(int i = input.length()-1; i>=0; i--){
           output.append(ans[i]);


        }
        return output.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        String orignalString = sc.next();
//        String orignalString = sc.nextLine();
        String result = reversString(orignalString);
        System.out.println("Original String is :"+orignalString);
        System.out.println("Reversed String is :"+ result);
    }
}
