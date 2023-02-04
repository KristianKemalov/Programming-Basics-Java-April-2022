package ForLoop.Excercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people=Integer.parseInt(sc.nextLine());
        double total=0;
        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        int p5=0;


        for (int i = 1; i <=people ; i++) {
            int peopleCount=Integer.parseInt(sc.nextLine());
            total+=peopleCount;
            if (peopleCount<=5){
                p1+=peopleCount;
            }else if (peopleCount<=12){
                p2+=peopleCount;
            }else if (peopleCount<=25){
                p3+=peopleCount;
            }else if (peopleCount<=40){
                p4+=peopleCount;
            }else p5+=peopleCount;
        }

        System.out.printf("%.2f%%%n",p1/total*100);
        System.out.printf("%.2f%%%n",p2/total*100);
        System.out.printf("%.2f%%%n",p3/total*100);
        System.out.printf("%.2f%%%n",p4/total*100);
        System.out.printf("%.2f%%%n",p5/total*100);












    }
}
