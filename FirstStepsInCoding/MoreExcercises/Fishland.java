package FirstStepsInCoding.MoreExcercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double skumria=Double.parseDouble(sc.nextLine());
        double tsatsa=Double.parseDouble(sc.nextLine());
        double kgpalamud=Double.parseDouble(sc.nextLine());
        double kgsafrid=Double.parseDouble(sc.nextLine());
        int midi=Integer.parseInt(sc.nextLine());

        double midicost=midi*7.5;

        double palamud=skumria+(skumria*0.6);
        double safrid=tsatsa+(tsatsa*0.8);

        double palamudcost=kgpalamud*palamud;
        double safridcost=kgsafrid*safrid;

        double totalcost=midicost+palamudcost+safridcost;
        System.out.printf("%.2f",totalcost);



    }
}
