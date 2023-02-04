package ConditionalStatementsAdvanced.MoreExcercises;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(sc.nextLine());
            if (number >= 0) {
                System.out.printf("Result: %.2f%n", number * 2);
            }else if (number<0){
                System.out.println("Negative number!");
                break;
            }
        }


    }
}
