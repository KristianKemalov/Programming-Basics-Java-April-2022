package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        boolean isValid=(num>=100&&num<=200)||num==0;
        if (!isValid){
            System.out.println("invalid");
        }
    }
}
