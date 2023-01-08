package ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months=Integer.parseInt(sc.nextLine());

        double elecmoney=0;
        double watermoney=0;
        double internetmoney=0;
        double mix=0;
        for (int i = 1; i <=months ; i++) {
            double electricity=Double.parseDouble(sc.nextLine());
            elecmoney+=electricity;
            watermoney+=20;
            internetmoney+=15;
            mix+=(electricity+15+20)*1.2;
        }
        double total=watermoney+elecmoney+internetmoney+mix;
        System.out.printf("Electricity: %.2f lv%n",elecmoney);
        System.out.printf("Water: %.2f lv%n",watermoney);
        System.out.printf("Internet: %.2f lv%n",internetmoney);
        System.out.printf("Other: %.2f lv%n",mix);
        System.out.printf("Average: %.2f lv",total/months);



    }
}
