package Lab5D3;

import java.util.Scanner;
public class Main_Lab5D3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Exercise1_Deposit interest = new Exercise1_Deposit();
        double balance,money,year;
        System.out.print("Please enter your money : ");
        money = scan.nextDouble();
        System.out.print("How many year for deposit : ");
        year = scan.nextDouble();
        balance = interest.CalINT_3(money,year);
        System.out.println("\n=== Congratulation ===");
        System.out.println("Interest : " + balance + " $");
        balance += money;
        System.out.print("Your balance : " + balance + " $");
    }
}
