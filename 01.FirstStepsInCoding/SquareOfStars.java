package com.company;

import java.util.Scanner;

public class SquareOfStars {
   public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String stars = new String(new char[n]).replace("\0", "*");
        String spaces = new String(new char[n-2]).replace("\0", " ");
        System.out.println(stars);
        for (Integer i=0;i<n-2;i++){
            System.out.println("*"+spaces+"*");
        }
        System.out.println(stars);

    }
}

