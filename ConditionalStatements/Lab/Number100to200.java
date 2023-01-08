package ConditionalStatements.Lab;

import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());

        if (n1 < 100) {
            System.out.println("Less than 100");
        }
        else if (n1 > 200) {
            System.out.println("Greater than 200");
        }else{
            System.out.println("Between 100 and 200");

        }
    }
}
