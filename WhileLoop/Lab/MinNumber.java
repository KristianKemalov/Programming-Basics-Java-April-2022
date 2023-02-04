package WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=Integer.MAX_VALUE;

        String input= sc.nextLine();
        while (!input.equals("Stop")){
            int number=Integer.parseInt(input);
            if (number<min){
                min=number;
            }
            input= sc.nextLine();
        }
        System.out.println(min);

    }
}
