import java.util.Scanner;
public class Lab3D3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number >> ");
        int num = scan.nextInt();
        for (int i=1;i<=num;i++) {
            System.out.println();
            for (int j=1;j<=i;j++)
                System.out.print(j + "\t");
        }
    }
}
