package WhileLoop.Excercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width=Integer.parseInt(sc.nextLine());
        int height=Integer.parseInt(sc.nextLine());
        int pieces=width*height;

        while (pieces>=0 ){
        String input= sc.nextLine();
        if (input.equals("STOP")){
            break;
        }
            int currentpieces=Integer.parseInt(input);
            pieces-=currentpieces;
        }
        if (pieces>0){
            System.out.printf("%d pieces are left.",pieces);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(pieces));
        }
        }

}
