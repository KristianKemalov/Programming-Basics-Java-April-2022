package ConditionalStatements.MoreExcercises;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        double litresInTank = Double.parseDouble(sc.nextLine());
        if (type.equals("Diesel"))
            if (litresInTank >= 25) System.out.println("You have enough diesel.");
            else System.out.println("Fill your tank with diesel!");
        else if (type.equals("Gas"))
            if (litresInTank >= 25) System.out.println("You have enough gas.");
            else System.out.println("Fill your tank with gas!");
        else if (type.equals("Gasoline"))
            if (litresInTank >= 25) System.out.println("You have enough gasoline.");
            else System.out.println("Fill your tank with gasoline!");

        else System.out.printf("Invalid fuel!");


    }
}
