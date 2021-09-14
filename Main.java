/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        final int cr = 350;
        System.out.println("What is the length of the room?");
        Scanner s1 = new Scanner(System.in);
        int l = s1.nextInt();
        System.out.println("What is the width of the room?");
        Scanner s2 = new Scanner(System.in);
        int w = s2.nextInt();
        int a = l*w;
        if(a % cr > 0)
            System.out.println("You will need to purchase " + ((a/cr) + 1) + " gallons of paint to cover " + a);
        else
            System.out.println("You will need to purchase " + (a/cr) + " gallons of paint to cover " + a);
    }
}
