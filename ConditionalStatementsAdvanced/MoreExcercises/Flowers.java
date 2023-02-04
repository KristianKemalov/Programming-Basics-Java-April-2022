package ConditionalStatementsAdvanced.MoreExcercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chrysanthems = Integer.parseInt(sc.nextLine());
        int roses = Integer.parseInt(sc.nextLine());
        int laleta = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        String dayoff = sc.nextLine();
        double totalflowers = laleta + chrysanthems + roses;
        double totalcost = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                totalcost=chrysanthems*2+roses*4.1+laleta*2.5;
                break;
            case"Winter":
            case "Autumn":
                totalcost=chrysanthems*3.75+roses*4.5+laleta*4.15;
                break;
        }
        if (dayoff.equals("Y")){
            totalcost=totalcost*1.15;
        }
        if (season.equals("Spring")&&laleta>=7){
            totalcost=totalcost*0.95;
        }else if (season.equals("Winter")&&roses>=10){
            totalcost=totalcost*0.9;
        }
        if (totalflowers>=20){
            totalcost=totalcost*0.8;
        }
        totalcost=totalcost+2;
        System.out.printf("%.2f",totalcost);


    }
}
