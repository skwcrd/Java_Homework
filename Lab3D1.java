import java.util.Scanner;
public class Lab3D1 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double ans,a,b,c;
        System.out.print("Enter A >> ");
        a = scan.nextDouble();
        System.out.print("Enter B >> ");
        b = scan.nextDouble();
        System.out.print("Enter C >> ");
        c = scan.nextDouble();
        ans = Math.pow(b,2)-(4*a*c);
        if (ans >= 0)
            System.out.println("\nAnswer is " + ans);
        else
            System.out.println("\nNo answer");
    }
}
