import java.util.Scanner;
public class Lab4D2 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a,b,ab;
        int size_a,size_b;
        System.out.print("Enter array size [A] >> ");
        size_a = scan.nextInt();
        a = new int[size_a];
        for (int i=0;i<a.length;i++){
            System.out.print("Enter Number ["+(i+1)+"] Array [A] >> ");
            a[i] = scan.nextInt();
        }
        System.out.print("Enter array size [B] >> ");
        size_b = scan.nextInt();
        b = new int[size_b];
        for (int i=0;i<b.length;i++){
            System.out.print("Enter Number ["+(i+1)+"] Array [B] >> ");
            b[i] = scan.nextInt();
        }
        ab = new int[size_a+size_b];
        System.arraycopy(a,0,ab,0,a.length);
        System.arraycopy(b,0,ab,a.length,b.length);
        for (int i=0;i<ab.length;i++){
            System.out.print("\t" + ab[i]);
            if ((i+1)%3 == 0)
                System.out.println();
        }
    }
}