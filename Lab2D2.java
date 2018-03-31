import java.util.Scanner;
public class Lab2D2 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double score;
        char grade;
        System.out.print("Enter score >> ");
        score = scan.nextDouble();
        score = Math.round(score);
        if (score>100||score<0)
            System.out.print("\tERROR!!!");
        else {
            if (score >= 80)
                grade = 'A';
            else if (score >= 70)
                grade = 'B';
            else if (score >= 60)
                grade = 'C';
            else if (score >= 50)
                grade = 'D';
            else
                grade = 'F';
            System.out.print("Grade is " + grade);
        }
    }
}
