package ForLoop.Lab;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i <= n; i += 2) {
            double pow = Math.pow(2, i);
            System.out.printf("%.0f%n",pow);
        }

    }


   }


