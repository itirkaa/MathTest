package com.company.view;

import com.company.model.MyMathematics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        while(true){
            MyMathematics test = new MyMathematics();

            System.out.println("Test: \n");
            System.out.println("1. Enter True/False\n Is "+test.getRandomNumber()+" a prime number.\n");
            if(test.setAnswerOne(scan.nextBoolean())){
                System.out.println("Correct Answer!");
            }

            System.out.println("2. Enter any divisor of the following number: \n Is "+test.getRandomNumber()+"\n");
            if(test.setAnswerTwo(scan.nextInt())){
                System.out.println("Correct Answer!");
            };

            System.out.println("YOUR SCORED: "+test.getScore()+" OUT OF 2\n");

            System.out.println("Want to practice more questions?\n1. Yes \n2. No\n");
            int ans = scan.nextInt();
            if(ans == 2) {
                System.exit(0);
            }
       }
    }
}
