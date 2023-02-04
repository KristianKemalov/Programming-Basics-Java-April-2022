package FirstStepsInCoding.MoreExcercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double degC =Double.parseDouble(sc.nextLine());
        double degF= degC*1.8+32;

        System.out.printf("%.2f",degF);
    }
}
