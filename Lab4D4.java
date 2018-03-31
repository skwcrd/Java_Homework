import java.util.Scanner;
public class Lab4D4 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double div=0;
        System.out.print("Enter array size >> ");
        int size = scan.nextInt();
        double[] num = new double[size];
        for (int i=0;i<size;i++){
            System.out.print("Enter Number ["+(i+1)+"] >> ");
            num[i] = scan.nextDouble();
        }
        for (int i=0;i<size;i++)
            div += Math.pow(num[i],2);
        div = Math.sqrt(div);
        System.out.print("Array = {");
        for (int i=0;i<size;i++){
            num[i] /= div;
            if(i==size-1)
                System.out.print(num[i]+"}");
            else
                System.out.print(num[i]+", ");
        }
    }
}
