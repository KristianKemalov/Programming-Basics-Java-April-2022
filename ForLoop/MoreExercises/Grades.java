package ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = Integer.parseInt(sc.next());
        double totalgrades = 0;
        int fail = 0;
        int good = 0;
        int verygood = 0;
        int top = 0;
        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(sc.next());
            totalgrades+=grade;
            if (grade <= 2.99) {
                fail++;
            }else if (grade<=3.99){
                good++;
            }else if(grade<=4.99){
                verygood++;
            }else {
                top++;
            }

        }

        System.out.printf("Top students: %.2f%%%n",(top*1.00/students*100));
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",verygood*1.00/students*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",good*1.00/students*100);
        System.out.printf("Fail: %.2f%%%n",fail*1.00/students*100);
        System.out.printf("Average: %.2f",totalgrades/students);

    }
}
