package FirstStepsInCoding.MoreExcercises;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double length=Double.parseDouble(scanner.nextLine());
        double high=Double.parseDouble(scanner.nextLine());

        double area=(length*high)/2;
        System.out.printf("%.2f",area);



    }
}
