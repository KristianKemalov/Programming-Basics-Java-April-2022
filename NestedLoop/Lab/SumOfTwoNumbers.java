package NestedLoop.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magic = Integer.parseInt(sc.nextLine());
        int counter = 0;
        boolean isFound = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                counter++;
                if (i + j == magic) {
                    System.out.printf("Combination N:%d ", counter);
                    System.out.printf("(%d + %d = %d)", i, j, i + j);
                    isFound = true;
                    break;
                }

            }
            if (isFound) {
                break;
            }
        }
    if (!isFound){
        System.out.printf("%d combinations - neither equals %d",counter,magic);
    }
    }
}


