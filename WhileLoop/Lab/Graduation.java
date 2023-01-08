package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int classs = 1;
        int goodgrades = 0;
        int badgrades = 0;
        double allgrades=0;
        while (goodgrades < 12) {


            double currentgrade = Double.parseDouble(sc.nextLine());

            if (currentgrade >= 4) {
                goodgrades++;
            } else {
                badgrades++;
            }
            if (badgrades>=2){
                break;
            }
            classs++;
            allgrades+=currentgrade;
        }
        if (goodgrades==12){
            System.out.printf("%s graduated. Average grade: %.2f",name,allgrades/12);
        }else {
            System.out.printf("%s has been excluded at %d grade",name,classs-1);
        }
    }
}
