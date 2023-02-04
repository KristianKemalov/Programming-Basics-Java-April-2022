package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class AnimalType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type) {
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            case "dog":
                System.out.println("mammal");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
