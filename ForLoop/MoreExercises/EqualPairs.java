package ForLoop.MoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number=Integer.parseInt(sc.nextLine());
        int count=0;
        int count2=0;
        int maxDiff=Integer.MIN_VALUE;
        int minDiff=Integer.MAX_VALUE;
        for (int i = 1; i <=number ; i++) {
            int n1=Integer.parseInt(sc.nextLine());
            int n2=Integer.parseInt(sc.nextLine());
            if (n1+n2==number){
                count++;
                minDiff=n1+n2;
            }else if (Math.abs(n1+n2-number)>maxDiff){
                maxDiff=(Math.abs(n1+n2-number));


                }
            }
            if (count==number){
                System.out.printf("Yes value=%d",minDiff);
            }else{
                System.out.printf("No, maxdiff=%d",maxDiff);
            }
        }
    }

