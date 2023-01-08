package ConditionalStatementsAdvanced.Excercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        double result = 0;
        switch (operator) {
            case "+":
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", n1, n2, result);
                } else System.out.printf("%d + %d = %.0f - odd", n1, n2, result);
                break;
            case "-":
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", n1, n2, result);
                } else System.out.printf("%d - %d = %.0f - odd", n1, n2, result);
                break;
            case "*":
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", n1, n2, result);
                } else System.out.printf("%d * %d = %.0f - odd", n1, n2, result);
                break;
            case "/":
                if (n2 != 0){

                result = n1 * 1.00 / n2;
                System.out.printf("%d / %d = %.2f",n1,n2,result);
                }else System.out.printf("Cannot divide %d by zero",n1);
                break;
            case "%":
                if (n2!=0){
                    result=n1%n2;
                    System.out.printf("%d %% %d = %.0f",n1,n2,result);
                }else System.out.printf("Cannot divide %d by zero",n1);
                break;
        }








    }
}
