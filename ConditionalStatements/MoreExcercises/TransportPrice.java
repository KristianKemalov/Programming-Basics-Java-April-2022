package ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km=Integer.parseInt(sc.nextLine());
        String kind= sc.nextLine();
        double totalcost=0;

        if (kind.equals("day")){
        }if (km<20){
            totalcost=km*0.79+0.7;
        }else if (km<100){
            totalcost=km*0.09;
        }else {
            totalcost=km*0.06;
        }
        if (kind.equals("night")){
            if (km < 20) {
                totalcost=km*0.9+0.7;
            }
        }
        System.out.printf("%.2f",totalcost);


    }
}
