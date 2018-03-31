import java.util.Scanner;
public class Lab2D1 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.print("Enter number >> ");
        num = scan.nextInt();
        if (num%2==0)
            System.out.print("\"The number is Even\"");
        else
            System.out.print("\"The number is Odd\"");
    }
}
