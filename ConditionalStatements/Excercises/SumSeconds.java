package ConditionalStatements.Excercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());

        int min=(n1+n2+n3)/60;
        int sec=(n1+n2+n3)%60;
        if (sec<10){
            System.out.println(min+":0"+sec);

        }else {
            System.out.println(min+":"+sec);
        }

    }
}
