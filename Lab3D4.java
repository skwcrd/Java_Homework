import java.util.Scanner;
public class Lab3D4 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number >> ");
        int num = scan.nextInt();
        for (int i=2;i<=num;i++) {
            System.out.println();
            for (int j=1;j<13;j++)
                System.out.println(i + " x " + j + " = " + (i*j));
        }
    }
}
