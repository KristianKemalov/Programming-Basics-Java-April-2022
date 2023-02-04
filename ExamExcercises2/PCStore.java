package ExamExcercises2;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double processroPrice=Double.parseDouble(sc.nextLine());
        double videocardPrice=Double.parseDouble(sc.nextLine());
        double ramPrice=Double.parseDouble(sc.nextLine());
        int rams=Integer.parseInt(sc.nextLine());
        double discount=Double.parseDouble(sc.nextLine());

        double ram=ramPrice*rams;
        double videocard=videocardPrice-(videocardPrice*discount);
        double processor=processroPrice-(processroPrice*discount);

        double money=(ram+videocard+processor)*1.57;


        System.out.printf("Money needed - %.2f leva.",money);
    }
}
