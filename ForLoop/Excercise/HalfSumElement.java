package ForLoop.Excercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;


        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(sc.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        if ((sum - max) == max) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(max - (sum - max)));

        }
    }
}
