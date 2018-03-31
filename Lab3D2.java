import java.util.Scanner;
public class Lab3D2 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double fahrenheit,celsius;
        System.out.println("This program converts Fahrenheit to Celsius");
        System.out.print("Enter Fahrenheit temperature : ");
        fahrenheit = scan.nextDouble();
        celsius = 5.0/9.0*(fahrenheit-32.0);
        System.out.println("Celsius equivalent = " + celsius);
    }
}
