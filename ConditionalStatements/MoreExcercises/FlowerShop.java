package ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //•	Магнолии – 3.25 лева
        //•	Зюмбюли – 4 лева
        //•	Рози – 3.50 лева
        //•	Кактуси – 8 лева
        //От общата сума, Мария трябва да плати 5% данъци.
        int magnols=Integer.parseInt(sc.nextLine());
        int zambuls=Integer.parseInt(sc.nextLine());
        int roses=Integer.parseInt(sc.nextLine());
        int cactus=Integer.parseInt(sc.nextLine());
        double giftPrice=Double.parseDouble(sc.nextLine());
        double income=magnols*3.25+zambuls*4+roses*3.5+cactus*8;
        double finalIncome=income*0.95;

        if (finalIncome>=giftPrice){
            System.out.printf("She is left with %.0f leva.",Math.floor(finalIncome-giftPrice));
        }else {
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(giftPrice-finalIncome));
        }






    }
}
