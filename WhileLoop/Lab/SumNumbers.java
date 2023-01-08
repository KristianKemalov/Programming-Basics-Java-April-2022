package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        int sum=0;
        while (sum<number){
            int n1=Integer.parseInt(sc.nextLine());
            sum+=n1;
        }
        System.out.println(sum);
    }
}
