package com.company.controller;

public class IsPrimeNumber {
    public boolean isPrimeNumber(int num){
        boolean flag = true;
        if (num%2==0)
            flag = false;
        for(int i = 3; i <= num/2; i++){
            if (num%i==0){
                flag = false;
                break;
            }
            else
                flag = true;
        }
        return flag;
    }
}
