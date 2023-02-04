package ConditionalStatements.Lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        String correct = "s3cr3t!P@ssw0rd";

        if (pass.equals(correct)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
