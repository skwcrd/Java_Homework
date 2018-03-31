import java.util.Scanner;
public class Lab4D3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        char[] ch = new char[26];
        for (int i=0;i<26;i++){
            ch[i] = (char)('a'+i);
        }
        System.out.print("Enter number [1-26] >> ");
        int num = scan.nextInt();
        while (num<1||num>26){
            System.out.print("\n\tError!!!\n\n");
            System.out.print("Enter number again [1-26] >> ");
            num = scan.nextInt();
        }
        System.out.println();
        for (int i=0;i<num;i++)
            System.out.print(ch[i]+" ");
        System.out.println();
    }
}