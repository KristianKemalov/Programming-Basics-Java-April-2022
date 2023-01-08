package ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V=Integer.parseInt(sc.nextLine());
        int P1=Integer.parseInt(sc.nextLine());
        int P2=Integer.parseInt(sc.nextLine());
        double H=Double.parseDouble(sc.nextLine());
        double P1water=P1*H;
        double P2water=P2*H;
        double totalwater=P1water+P2water;
        double perCentFull=(totalwater/V)*100;
        double perCentP1=(P1water/totalwater)*100;
        double perCentP2=(P2water/totalwater)*100;
        if (V>=totalwater){
            System.out.printf("The pool is %.2f full. " +
                    "Pipe 1: %.2f. Pipe 2: %.2f.",perCentFull,perCentP1,perCentP2);
        }else{
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",H,Math.abs(V-totalwater));
        }




    }
}
