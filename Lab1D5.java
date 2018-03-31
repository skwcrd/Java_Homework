import java.util.Scanner;
public class Lab1D5 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        final double VAT_RATE = 0.07;
        double price,Price_VAT;
        String name;
        System.out.print("Enter name product >> ");
        name = scan.nextLine();
        System.out.print("Enter price product >> ");
        price = scan.nextDouble();
        Price_VAT = price+(price*VAT_RATE); //Price includes vat
        System.out.print("Name PRO. : " + name + "\nPrice includes vat = " + Price_VAT + " baht.");
    }
}
