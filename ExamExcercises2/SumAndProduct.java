package ExamExcercises2;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        boolean flag1=false;
        boolean flag2=false;

        for (int a = 1; a <= 9; a++) {
            if (flag1==true||flag2==true){
                break;
            }
            for (int b = 9; b >= a; b--) {
                if (flag1==true||flag2==true){
                    break;
                }
                for (int c = 0; c < 9; c++) {
                    if (flag1==true||flag2==true){
                        break;
                    }
                    for (int d = 9; d >= c; d--) {
                        if (a + b + c + d == a * b * c * d && n % 10 == 5) {
                            flag1=true;
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            break;

                        }
                        if ((a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0){
                            flag2=true;
                            System.out.printf("%d%d%d%d",d,c,b,a);
                            break;
                        }
                        }

                    }

                }

            }
        if (flag1==false&&flag2==false){
            System.out.println("Nothing found");
        }
        }
    }

