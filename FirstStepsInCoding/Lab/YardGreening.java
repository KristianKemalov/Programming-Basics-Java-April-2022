package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Цената на един кв. м. е 7.61 лв със ДДС
        //18% отстъпка от крайната цена.
        //На конзолата се отпечатват два реда:
        //•	"The final price is: {крайна цена на услугата} lv."
        //•	"The discount is: {отстъпка} lv."
        double metres=Double.parseDouble(scanner.nextLine());

        double price=metres*7.61;
        double discount=price*0.18;
        double finalprice=price-discount;

        System.out.printf("The final price is:%f lv.%n",finalprice);
        System.out.printf("The discount is:%f",discount);

    }
}
