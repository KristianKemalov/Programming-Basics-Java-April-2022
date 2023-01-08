package WhileLoop.Excercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPoorGrades = Integer.parseInt(sc.nextLine());
        double totalSumGrades = 0;
        int contProblems = 0;
        String lastProblem = "";
        int count = 0;
        boolean win = false;

        while (count < countPoorGrades){
            String problemName = sc.nextLine();
            if (problemName.equals("Enough")){
                win = true;
                break;
            }

            int currentGrade = Integer.parseInt(sc.nextLine());
            if(currentGrade <= 4){
                count++;
            }
            totalSumGrades = totalSumGrades + currentGrade;
            contProblems++;
            lastProblem = problemName;
        }
        if(win){
            System.out.printf("Average score: %.2f%n", totalSumGrades / contProblems);
            System.out.printf("Number of problems: %d%n", contProblems);
            System.out.printf("Last problem: %s%n", lastProblem);
        }else{
            System.out.printf("You need a break, %d poor grades.", count);
        }
    }
}
