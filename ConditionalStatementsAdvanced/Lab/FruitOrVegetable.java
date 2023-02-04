package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        if (name.equals("banana")||name.equals("cherry")||name.equals("lemon")||name.equals("grapes")||name.equals("apple")||name.equals("kiwi")){
            System.out.println("fruit");
        }else if (name.equals("tomato")||name.equals("cucumber")||name.equals("pepper")||name.equals("carrot")){
            System.out.println("vegetable");
        }else System.out.println("unknown");
    }
}
