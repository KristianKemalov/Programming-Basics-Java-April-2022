package NestedLoop.Excercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());

        for (int i = n1; i <= n2; i++) {
            int currentnum = i;
            int evensum = 0;
            int ooddsum = 0;
            for (int j = 6; j >= 1; j--) {
                int digit = currentnum % 10;
                if (j % 2 == 0) {
                    evensum += digit;
                } else {
                    ooddsum += digit;
                }
                currentnum /= 10;
            }
           if (evensum==ooddsum){
            System.out.print(i+ " ");

           }

        }
    }
}
