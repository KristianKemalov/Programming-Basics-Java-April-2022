package ExamExcercises;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int egg1 = Integer.parseInt(sc.nextLine());
        int egg2 = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();


        while (!input.equals("End")) {
            if (input.equals("one")) {
                egg2--;
            } else {
                egg1--;
            }
            if (egg1 == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", egg2);
                break;
            } else if (egg2 == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", egg1);
                break;
            }
            input = sc.nextLine();
        }

        if (input.equals("End")){
            System.out.printf("Player one has %d eggs left.%n",egg1);
            System.out.printf("Player two has %d eggs left.",egg2);
        }
    }

}
