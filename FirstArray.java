package com.cohortFive.tdd;

public class FirstArray {
    public static void main(String[] args) {
      final int ARRAY_LENGTH=20;
      int c []=new int[ARRAY_LENGTH];
        for(int counter=0;counter< c.length;counter++){
            if (counter==0){
                c[counter]=1;
            }else {
            c[counter]=5*counter;}
        }

        System.out.printf("%s%10s%n","index","value");
        for(int counter=1; counter<c.length+1;counter++){
            System.out.printf("%d%10d%n",counter,c[counter-1]);}

        }

        }


