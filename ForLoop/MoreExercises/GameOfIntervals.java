package ForLoop.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plays=Integer.parseInt(sc.nextLine());
        double result=0;
        int onetonine=0;
        int tentonineteen=0;
        int twentytotwnine=0;
        int thirtytothnine=0;
        int fourtyfifty=0;
        int invalid=0;

        for (int i = 1; i <=plays ; i++) {
            int number=Integer.parseInt(sc.nextLine());
                if (number<10&&number>=0){
                onetonine++;
                result+=number*0.2;
                }else if (number<20&&number>=0){
                    tentonineteen++;
                    result+=number*0.3;
                }else if (number<30&&number>=0){
                    twentytotwnine++;
                    result+=number*0.4;
                }else if (number<40&&number>=0){
                    thirtytothnine++;
                    result+=50;
                }else if (number<=50&&number>=0){
                    fourtyfifty++;
                    result+=100;
                }else{
                    invalid++;
                    result/=2;
                }

        }


        System.out.printf("%.2f%n",result);
        System.out.printf("From 0 to 9: %.2f%%%n",onetonine*1.00/plays*100);
        System.out.printf("From 10 to 19: %.2f%%%n",tentonineteen*1.00/plays*100);
        System.out.printf("From 20 to 29: %.2f%%%n",twentytotwnine*1.00/plays*100);
        System.out.printf("From 30 to 39: %.2f%%%n",thirtytothnine*1.00/plays*100);
        System.out.printf("From 40 to 50: %.2f%%%n",fourtyfifty*1.00/plays*100);
        System.out.printf("Invalid numbers: %.2f%%",invalid*1.00/plays*100);

    }
}
