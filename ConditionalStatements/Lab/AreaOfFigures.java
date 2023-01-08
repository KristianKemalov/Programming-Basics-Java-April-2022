package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kind = sc.nextLine();


        if (kind.equals("square")) {
            double n1 = Double.parseDouble(sc.nextLine());
            double area = n1 * n1;
            System.out.printf("%.3f", area);
        } else if (kind.equals("rectangle")) {
            double n1 = Double.parseDouble(sc.nextLine());
            double n2 = Double.parseDouble(sc.nextLine());
            double area = n1 * n2;
            System.out.printf("%.3f", area);
        } else if (kind.equals("circle")) {
            double n1 = Double.parseDouble(sc.nextLine());
            double area = Math.PI * (n1 * n1);
            System.out.printf("%.3f", area);
        } else {
            double n1 = Double.parseDouble(sc.nextLine());
            double n2 = Double.parseDouble(sc.nextLine());
            double area = n1 * n2 / 2;
            System.out.printf("%.3f", area);
        }


    }
}
