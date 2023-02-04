package WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double balance = 0;


        while (!input.equals("NoMoreMoney")) {
            double vnoska = Double.parseDouble(input);
            if (vnoska < 0) {
                System.out.println("Invalid operation!");
                break;
            }
                balance += vnoska;
                System.out.printf("Increase: %.2f%n",vnoska);
                input = sc.nextLine();

        }
        System.out.printf("Total: %.2f",balance);
    }
}
