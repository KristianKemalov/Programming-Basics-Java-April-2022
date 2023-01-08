package NestedLoop.Excercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movie = sc.nextLine();
        int countkid = 0;
        int countstandard = 0;
        int countstudent = 0;
        int counter = 0;
        while (!movie.equals("Finish")) {
            int freeseats = Integer.parseInt(sc.nextLine());
            int currentcounter = 0;


            String input = sc.nextLine();
            while (!input.equals("End")) {
                counter++;
                currentcounter++;
                switch (input){
                    case "standard":
                        countstandard++;
                        break;
                    case "student":
                        countstudent++;
                        break;
                    case "kid":
                        countkid++;
                        break;
                }
                if (freeseats==currentcounter){
                    break;
                }


                    input = sc.nextLine();

            }

            System.out.printf("%s - %.2f%% full.%n",movie,currentcounter*1.00/freeseats*100);
                movie = sc.nextLine();
        }

        System.out.printf("Total tickets: %d%n",counter);
        System.out.printf("%.2f%% student tickets.%n",countstudent*1.00/counter*100);
        System.out.printf("%.2f%% standard tickets.%n",countstandard*1.00/counter*100);
        System.out.printf("%.2f%% kids tickets.%n",countkid*1.00/counter*100);

    }

}