package ConditionalStatements.Excercises;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour=Integer.parseInt(sc.nextLine());
        int min=Integer.parseInt(sc.nextLine());

        int totalmin=hour*60+min+15;
        int newhour=totalmin/60;
        int newmin=totalmin%60;
        if (newhour==24){
            newhour=0;
        }
        System.out.printf("%d:%02d",newhour,newmin);
    }
}
