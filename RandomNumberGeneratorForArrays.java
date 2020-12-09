package com.cohortFive.tdd;

import java.security.SecureRandom;

public class RandomNumberGeneratorForArrays {
    public static void main(String[] args) {
        SecureRandom randomNumber=new SecureRandom();
        int a[]=new int[5];
        for(int counter=0;counter<a.length;counter++){
            a[counter]=1+randomNumber.nextInt(5);
        }
        for(int counter=0;counter<a.length;counter++){
            System.out.printf("%d ",a[counter]);

        }

        }
    }

