package FirstStepsInCoding.Excercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Трябва да се пресметне колко литра вода ще събира аквариума,
        // ако се знае, че определен процент от вместимостта му е заета от пясък, растения, нагревател и помпа.
        //От конзолата се четат 4 реда:
        //1.	Дължина в см – цяло число в интервала [10 … 500]
        //2.	Широчина в см – цяло число в интервала [10 … 300]
        //3.	Височина в см – цяло число в интервала [10… 200]
        //4.	Процент  – реално число в интервала [0.000 … 100.000]
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
        int length=Integer.parseInt(scanner.nextLine());
        int width=Integer.parseInt(scanner.nextLine());
        int high=Integer.parseInt(scanner.nextLine());
        double percent= Double.parseDouble(scanner.nextLine());

        int area=length*width*high;
        double arealitres=area*0.001;
        double waterneed=arealitres-(arealitres*percent/100);
        System.out.println(waterneed);


    }
}
