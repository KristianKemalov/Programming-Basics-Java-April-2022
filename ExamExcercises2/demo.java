package ExamExcercises2;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        int n = Integer.parseInt(sc.nextLine());
        boolean flag1 = false;
        boolean flag2 = false;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c < 9; c++) {

                    for (int d = 9; d >= c; d--) {
                        if (a + b + c + d == a * b * c * d && n % 10 == 5) {
                            System.out.printf("%d",a);
                            break;

                        }
                        if ((a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0) {
                            System.out.printf("%d",d);
                            break;
                        }
                    }

                }

            }

        }
    }
}

