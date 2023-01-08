package ForLoop.Lab;

import java.util.Enumeration;
import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            leftSum += num;
        }
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            rightSum += num;
        }
        if (leftSum==rightSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }else System.out.printf("No, diff = %d",Math.abs(leftSum-rightSum));
    }
}