package WhileLoop.Excercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bookname = sc.nextLine();
        int bookcounter = 0;
        boolean bookfound = false;


        String input = sc.nextLine();

        while (!input.equals("No More Books")) {
            if (input.equals(bookname)) {
                bookfound = true;
                break;
            }
            input = sc.nextLine();
            bookcounter++;
        }

        if (bookfound == true) {
            System.out.printf("You checked %d books and found it.", bookcounter);

        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %s books.",bookcounter);
        }
    }
}
