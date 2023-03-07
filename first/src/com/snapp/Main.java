package com.snapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //  double a = 2, b = 5, c = 30;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = scanner.nextInt();

        System.out.println("Podaj b");
        int b = scanner.nextInt();






        if (a>b)
        {
            System.out.println("A jest większe od B o " + (a - b));
        }
        else if (a==b){
            System.out.println("A jest równe B");
        }
        else
        {
            System.out.println("B jest większe od A o " + (b-a));
        }


    }
}
