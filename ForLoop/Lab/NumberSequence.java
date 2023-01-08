package ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int maxNumber=Integer.MIN_VALUE;
        int minNumber=Integer.MAX_VALUE;

        for (int i = 0; i <n ; i++) {
            int number=Integer.parseInt(sc.nextLine());
            if (number>maxNumber){
                maxNumber=number;
            }
            if (number<minNumber){
                minNumber=number;
            }
        }
        System.out.printf("Max number: %d%n",maxNumber);
        System.out.printf("Min number: %d%n",minNumber);
    }
}
