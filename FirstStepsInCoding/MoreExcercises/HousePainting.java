package FirstStepsInCoding.MoreExcercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //за стените се използва зелена боя
        //за покрива – червена
        //Разхода на зелената боя е 1 литър за 3.4 м2
        //червената – 1 литър за 4.3 м2
        double x=Double.parseDouble(sc.nextLine());
        double y=Double.parseDouble(sc.nextLine());
        double h=Double.parseDouble(sc.nextLine());
        double baskside=x*x;
        double frontside=(x*x)-2.4;
        double leftside=(x*y)-(1.5*1.5);
        double rightside=(x*y)-(1.5*1.5);
        double greenpaint=(baskside+frontside+rightside+leftside)/3.4;

        double roof1=(x*y)*2;
        double roof2=2*(x*h/2);

        double redpaint=(roof1+roof2)/4.3;
        System.out.printf("%.2f%n",greenpaint);
        System.out.printf("%.2f",redpaint);
    }
}
