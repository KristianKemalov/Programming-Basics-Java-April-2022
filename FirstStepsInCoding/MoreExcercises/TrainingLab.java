package FirstStepsInCoding.MoreExcercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length =Double.parseDouble(sc.nextLine());
        double width =Double.parseDouble(sc.nextLine());

        width-=1;
        double widthDesks=Math.floor(width/0.7);
        double lengthDesks=Math.floor(length/1.2);
        double freeSpace=(widthDesks*lengthDesks)-3;

        System.out.printf("%.0f",freeSpace);




    }
}
