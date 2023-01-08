package WhileLoop.Excercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyNeed = Double.parseDouble(sc.nextLine());
        double moneyHave = Double.parseDouble(sc.nextLine());
        int daysCounter = 0;
        int spendCounter = 0;


        while (moneyHave < moneyNeed && spendCounter < 5) {
            String kind = sc.nextLine();
            double currentMoney = Double.parseDouble(sc.nextLine());
            if (kind.equals("save")) {
                moneyHave += currentMoney;
                spendCounter=0;
            } else {
                spendCounter++;
                if (currentMoney > moneyHave) {
                    moneyHave = 0;
                } else {
                    moneyHave -= currentMoney;
                }

            }
            daysCounter++;
        }

        if (moneyHave>=moneyNeed&&spendCounter<5){
            System.out.printf("You saved the money for %d days.",daysCounter);
        }else {
            System.out.println("You can't save the money.");
            System.out.printf("%d",daysCounter);
        }
    }
}
