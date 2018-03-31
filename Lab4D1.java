import java.util.Scanner;
public class Lab4D1 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] num = new int[5];
        int sum=0,min=0,max=0;
        double mean;
        for (int i=0;i<5;i++){
            System.out.print("Enter Number ["+(i+1)+"] >> ");
            num[i] = scan.nextInt();
            sum += num[i];
            if(i==1){
                min = Math.min(num[0],num[1]);
                max = Math.max(num[0],num[1]);
            }
            else if(i>1){
                min = Math.min(min,num[i]);
                max = Math.max(max,num[i]);
            }
        }
        mean = sum/5.0;
        System.out.print("\nNumber is ");
        for (int i=0;i<5;i++)
            System.out.print(num[i]+" ");
        System.out.print("\nSummation is "+sum+"\nMean is "+mean+"\nMaximum is "+max+"\nMinimum is "+min);
    }
}
