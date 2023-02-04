package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        double sales = Double.parseDouble(sc.nextLine());
        double result = 0;

        switch (city) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    result = sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    result = sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    result = sales * 0.08;
                } else if (sales>10000){
                    result = sales * 0.12;
                }else System.out.println("error");
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    result = sales * 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    result = sales * 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    result = sales * 0.1;
                } else if (sales>10000){
                    result = sales * 0.13;
                }else
                    System.out.println("error");
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    result = sales * 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    result = sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    result = sales * 0.12;
                } else if (sales>10000){
                    result = sales * 0.145;
                }else System.out.println("error");
                break;
            default:
                System.out.println("error");
                break;

        }
        if ((city.equals("Sofia")||city.equals("Varna")||city.equals("Plovdiv")&& sales>0)) System.out.printf("%.2f",result);
    }
}
