package ConditionalStatementsAdvanced.Excercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type= sc.nextLine();
        int r=Integer.parseInt(sc.nextLine());
        int k=Integer.parseInt(sc.nextLine());
        int rk=r*k;
        double price=0.0;
        switch (type){
            case "Premiere":
                price=rk*12;
                break;
            case "Normal":
                price=rk*7.5;
                break;
            case "Discount":
                price=rk*5;
                break;
        }

        System.out.printf("%.2f leva",price);

    }
}
