package ConditionalStatementsAdvanced.Lab;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour=Integer.parseInt(sc.nextLine());
        String day= sc.nextLine();
        if (hour>=10 && hour<=18){
            switch (day){
                case"Monday":
                    System.out.println("open");
                    break;
                case"Tuesday":
                    System.out.println("open");
                    break;
                case"Wedneday":
                    System.out.println("open");
                    break;
                case"Thursday":
                    System.out.println("open");
                    break;
                case"Friday":
                    System.out.println("open");
                    break;
                case"Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");
                    break;
            }
        }else System.out.println("closed");

    }
}
