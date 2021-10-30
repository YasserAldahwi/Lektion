package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "utf-8");
        System.out.print("Write something: ");

        while (sc.hasNext()){
            String input = sc.nextLine();
            if (input.equals("bye")){
                System.exit(0);
            }
            System.out.println("You said: "+input);
            System.out.print("Write something: ");
        }
    }
}
