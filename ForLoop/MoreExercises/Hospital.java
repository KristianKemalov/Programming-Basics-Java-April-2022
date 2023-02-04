package ForLoop.MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int period = Integer.parseInt(sc.nextLine());
        int treatedpatients = 0;
        int untreatedpatients = 0;
        int doctors = 7;


        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(sc.nextLine());
            if (i % 3 == 0 && untreatedpatients > treatedpatients) {
                doctors++;
            }
            if (patients <= doctors) {
                treatedpatients = treatedpatients + patients;
            } else {
                treatedpatients = treatedpatients + doctors;
                untreatedpatients = untreatedpatients + (patients - doctors);
            }

        }
        System.out.printf("Treated patients: %d.%n",treatedpatients);
        System.out.printf("Untreated patients: %d.",untreatedpatients);

    }
}
