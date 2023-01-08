package ExamExcercises2;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String kind = sc.nextLine();
        String review = sc.nextLine();

        int nights = days - 1;
        double cost=0;


        switch (kind) {
            case "room for one person":
                cost=nights*18;
                break;
            case "apartment":
                if (nights<10){
                    cost=(nights*25)*0.7;
                }else if (nights<15){
                    cost=(nights*25)*0.65;
                }else {
                    cost=(nights*25)*0.5;
                }
                break;
            case "president apartment":
                if (nights<10){
                    cost=(nights*35)*0.9;
                }else if (nights<15){
                    cost=(nights*35)*0.85;
                }else {
                    cost=(nights*35)*0.8;
                }
                break;
        }


        if (review.equals("positive")){
            cost=cost*1.25;
        }else {
            cost=cost*0.9;
        }
        System.out.printf("%.2f",cost);
    }
}
