package ExamExcercises2;

import java.util.Scanner;

public class BraceletStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double allownce=Double.parseDouble(sc.nextLine());
        double profitbyday=Double.parseDouble(sc.nextLine());
        double costs=Double.parseDouble(sc.nextLine());
        double presentPrice=Double.parseDouble(sc.nextLine());

        double moneyHave=(allownce*5+profitbyday*5)-costs;

        if (moneyHave>=presentPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.",moneyHave);
        }else {
            System.out.printf("Insufficient money: %.2f BGN.",presentPrice-moneyHave);
        }
    }
}
