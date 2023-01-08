package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                evenSum +=number;
            } else {
                oddSum +=number;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", evenSum);
        } else{ System.out.println("No");
        System.out.printf("Diff = %d", Math.abs(oddSum - evenSum));
    }
    }
}
