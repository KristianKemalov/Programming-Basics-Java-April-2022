package WhileLoop.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name= sc.nextLine();
        String pass= sc.nextLine();
        String input= sc.nextLine();
        while (!input.equals(pass)){
                input= sc.nextLine();
        }

        System.out.printf("Welcome %s!",name);
    }
}
