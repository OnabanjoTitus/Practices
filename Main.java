package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int minNumber;
        int maxNumber;
        int temp;
        int count = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number1:");
        minNumber = input.nextInt();
        maxNumber = minNumber;
        while (count <= 2) {
            System.out.printf("Enter the number%d:",count+1);
            temp = input.nextInt();
            if (temp > maxNumber) {
                maxNumber = temp;
            }
            if (temp < minNumber) {
                minNumber = temp;
            }


            count++;
        }

        System.out.printf("The largest is %d%nAnd the smallest is %d%n", maxNumber, minNumber);

    }


}