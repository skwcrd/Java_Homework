import java.util.Scanner;
public class Lab4D3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number [1-26] >> ");
        int num = scan.nextInt();
        while (num<1||num>26){
            System.out.print("\n\tError!!!\n\nEnter number again [1-26] >> ");
            num = scan.nextInt();
        }
        for (int i=0;i<num;i++)
            System.out.print(((char)('a'+i)) + " ");
    }
}