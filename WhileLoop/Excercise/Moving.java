package WhileLoop.Excercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width=Integer.parseInt(sc.nextLine());
        int length=Integer.parseInt(sc.nextLine());
        int height=Integer.parseInt(sc.nextLine());
        int totalspace=width*length*height;

        while (totalspace>=0){
            String input= sc.nextLine();
            if (input.equals("Done")){
                break;
            }
            int box=Integer.parseInt(input);
            totalspace-=box;

        }
    if (totalspace>0){
        System.out.printf("%d Cubic meters left.",totalspace);
    }else {
        System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(totalspace));
    }

    }

}
