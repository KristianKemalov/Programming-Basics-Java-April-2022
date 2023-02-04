package ForLoop.Excercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());
        int totalGloba = 0;

        for (int i = 1; i <= n; i++) {
            String website = sc.nextLine();
            if (website.equals("Facebook")) {
                totalGloba += 150;
            } else if (website.equals("Instagram")) {
                totalGloba += 100;
            } else if (website.equals("Reddit")) {
                totalGloba += 50;
            }
        }
        if (salary <= totalGloba) {
            System.out.println("You have lost your salary.");
        }
        if (salary>totalGloba){
            System.out.println(salary-totalGloba);
        }


        }
    }

