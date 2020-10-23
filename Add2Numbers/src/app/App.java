/*
Fixit 1

This program outputs all even numbers between two numbers given by the user, Change it so that it instead prints all ODD numbers.
*/

package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number.");
        int num1 = input.nextInt();
        input.nextLine();

        System.out.println("Please enter a larger number.");
        int num2 = input.nextInt();
        input.nextLine();

        for (int i = num1; i < num2; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}