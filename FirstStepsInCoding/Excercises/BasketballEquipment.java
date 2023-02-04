package FirstStepsInCoding.Excercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        //От конзолата се четe 1 ред:
        //•	Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]
        int fee=Integer.parseInt(scanner.nextLine());
        double sneackers=fee*0.6;
        double equip=sneackers*0.8;
        double ball=0.25*equip;
        double accesories=ball*0.2;

        double finalcost=sneackers+equip+ball+accesories+fee;
        System.out.println(finalcost);
    }
}
