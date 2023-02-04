package ExamExcercises2;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=Integer.parseInt(sc.nextLine());
        double totalratings=0;
        int currentrating=0;
        double totalsales=0;

        for (int i = 1; i <=n ; i++) {
            int sales=Integer.parseInt(sc.nextLine());
            currentrating=sales%10;
            totalratings+=currentrating;
            sales=sales/10;

            if (currentrating==3){
                totalsales+=sales*0.5;
            }else if (currentrating==4){
                totalsales+=sales*0.7;
            }else if (currentrating==5){
                totalsales+=sales*0.85;
            }else if (currentrating==6){
                totalsales+=sales;
            }



        }

        System.out.printf("%.2f%n",totalsales);
        System.out.printf("%.2f",totalratings/n);

    }
}
