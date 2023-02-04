package ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //•	Първи ред – брой дни – цяло число в интервал [1…5000]
        //•	Втори ред – оставена храна в килограми – цяло число в интервал [0…100000]
        //•	Трети ред – храна на ден за кучето в килограми – реално число в интервал [0.00…100.00]
        //•	Четвърти ред – храна на ден за котката в килограми– реално число в интервал [0.00…100.00]
        //•	Пети ред – храна на ден за костенурката в грамове – реално число в интервал [0.00…10000.00]
        int days=Integer.parseInt(sc.nextLine());
        int foodKg=Integer.parseInt(sc.nextLine());
        double dog=Double.parseDouble(sc.nextLine());
        double cat=Double.parseDouble(sc.nextLine());
        double turtle=Double.parseDouble(sc.nextLine());

        double turtleNeed=(turtle*days)/1000;
        double dogNeed=days*dog;
        double catNeed=days*cat;
        double totalFoodNeed=turtleNeed+catNeed+dogNeed;

        if (foodKg>=totalFoodNeed){
            System.out.printf("%.0f kilos of food left.",Math.floor(foodKg-totalFoodNeed));
        }else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(totalFoodNeed-foodKg));
        }




    }
}
