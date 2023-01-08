package ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity=Integer.parseInt(sc.nextLine());
        int fans=Integer.parseInt(sc.nextLine());
        int sa=0;
        int sb=0;
        int sv=0;
        int sg=0;

        for (int i = 1; i <=fans ; i++) {
            String sector= sc.nextLine();
            if (sector.equals("A")){
                sa++;
            }else if (sector.equals("B")){
                sb++;
            }else if (sector.equals("V")){
                sv++;
            }else {
                sg++;
            }

        }

        System.out.printf("%.2f%%%n",sa*1.00/fans*100);
        System.out.printf("%.2f%%%n",sb*1.00/fans*100);
        System.out.printf("%.2f%%%n",sv*1.00/fans*100);
        System.out.printf("%.2f%%%n",sg*1.00/fans*100);
        System.out.printf("%.2f%%",fans*1.00/capacity*100);
    }
}
