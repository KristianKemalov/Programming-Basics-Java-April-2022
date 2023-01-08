package ExamExcercises;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget=Double.parseDouble(sc.nextLine());
        int nights=Integer.parseInt(sc.nextLine());
        double pricebynight=Double.parseDouble(sc.nextLine());
        int extraspent=Integer.parseInt(sc.nextLine());

        double cost=0;
        if (nights>7){
             cost=nights*(pricebynight*0.95);
        }else {
         cost=nights*pricebynight;}

        double extra=budget*extraspent/100;
        double totalcost=extra+cost;

        if (budget>=totalcost){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-totalcost);
        }else {
            System.out.printf("%.2f leva needed.",totalcost-budget);
        }
    }
}
