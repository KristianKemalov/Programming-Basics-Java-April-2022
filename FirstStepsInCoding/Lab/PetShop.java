package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogfood=Integer.parseInt(scanner.nextLine());
        int catfood=Integer.parseInt(scanner.nextLine());

        double dogcost =dogfood*2.50;
        double catcost=catfood*4;
        double totalcost= catcost+dogcost;
        System.out.println(totalcost+" lv.");

    }
}
