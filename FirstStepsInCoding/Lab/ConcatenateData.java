package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  name = scanner.nextLine();
        String  surname = scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();
//"You are <firstName> <lastName>, a <age>-years old person from <town>."
        System.out.println("You are "+name +" "+surname+", a "+age+"-years old person from "+city+".");



    }

}
