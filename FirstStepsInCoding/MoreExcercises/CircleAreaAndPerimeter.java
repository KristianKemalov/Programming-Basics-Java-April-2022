package FirstStepsInCoding.MoreExcercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r=Double.parseDouble(sc.nextLine());
        double area=Math.PI*(r*r);
        double per=2*Math.PI*r;
        System.out.printf("%.2f%n",area);
        System.out.printf("%.2f",per);
    }
}
