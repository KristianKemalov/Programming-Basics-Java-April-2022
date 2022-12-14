package NestedLoop.Excercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int primesum = 0;
        int nonprimesum = 0;

        while (!input.equals("stop")) {
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input= sc.nextLine();
                continue;
            }
            boolean flag=true;
            for (int i = 2; i <=number-1 ; i++) {
                if (number%i==0){
                    nonprimesum+=number;
                    flag=false;
                    break;
                }
            }
            if (flag){
                primesum+=number;
            }

            input = sc.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n",primesum);
        System.out.printf("Sum of all non prime numbers is: %d",nonprimesum);
    }

}
