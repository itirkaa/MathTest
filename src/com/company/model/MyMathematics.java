package com.company.model;

import java.util.Random;
//import com.company.controller.IsPrimeNumber;

public class MyMathematics {
    private boolean answerOne;
    private int answerTwo;
    private int randomNumber;
    private int score;

    public MyMathematics(){
        this.answerOne = false;
        this.answerTwo = 0;
        this.randomNumber = this.generateRandomNumber();
        this.score = 0;
    }

    private int generateRandomNumber(){
        Random random = new Random();
        int num = random.nextInt(100); //TODO: add random number function
        return num;
    }

    private boolean isPrimeNumber(){
        boolean flag = true;
        if (this.randomNumber%2==0 && this.randomNumber>=2)
            flag = false;
        for(int i = 3; i <= randomNumber/2; i+=2){
            if (this.randomNumber%i==0){
                flag = false;
                break;
            }
            else
                flag = true;
        }
        return flag;
    }

    private boolean isDivisor(int num){
        boolean flag = true;
        if(this.randomNumber%num!=0)
            flag = false;
        return flag;
    }

    public boolean setAnswerOne(boolean answerOne) {
        if(isPrimeNumber() == answerOne){
            this.score = this.score + 1;
            return true;
        }
        else
            return false;
    }

    public boolean setAnswerTwo(int answerTwo) {
        if(isDivisor(answerTwo)){
            this.score = this.score + 1;
            return true;
        }
        return false;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getScore(){
        return this.score;
    }
}
