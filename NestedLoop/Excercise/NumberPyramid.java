package NestedLoop.Excercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean flag = false;
        int number = Integer.parseInt(sc.nextLine());
        int currentNumber = 0;
        for (int rows = 1; rows <= number ; rows++) {

            for (int cols = 1; cols <= rows  ; cols++) {
                currentNumber ++;
                if(currentNumber > number){
                    flag = true;
                    break;
                }
                System.out.print(currentNumber + " ");
            }
            if(flag){
                break;
            }
            System.out.println();
        }

    }

}
