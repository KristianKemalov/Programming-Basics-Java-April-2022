package WhileLoop.Excercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goal = 10000;
        String input = sc.nextLine();
        int stepsmade = 0;


        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            stepsmade += steps;
            if (stepsmade >= goal) {
                break;
            }
            input = sc.nextLine();
        }
        if (input.equals("Going home")) {
            int stepsday = Integer.parseInt(sc.nextLine());
            stepsmade += stepsday;
        }

        if (stepsmade >= goal) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", stepsmade - goal);
        }else {
            System.out.printf("%d more steps to reach goal.",goal-stepsmade);
        }
    }
}
