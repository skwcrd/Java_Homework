import java.util.Scanner;
public class Lab2D3 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double fee=0,Time,TimeIn,TimeOut,day,hour,minute;
        System.out.print("Enter DAY [IN] >> ");
        day = scan.nextDouble();
        System.out.print("Enter HOUR [IN] >> ");
        hour = scan.nextDouble();
        System.out.print("Enter MINUTE [IN] >> ");
        minute = scan.nextDouble();
        TimeIn = (day*24.0)+hour+(minute/60.0);
        System.out.print("Enter DAY [OUT] >> ");
        day = scan.nextDouble();
        System.out.print("Enter HOUR [OUT] >> ");
        hour = scan.nextDouble();
        System.out.print("Enter MINUTE [OUT] >> ");
        minute = scan.nextDouble();
        TimeOut = (day*24.0)+hour+(minute/60.0);
        Time = TimeOut-TimeIn;
        if (Time >= 24.0) {
            fee += Math.floor(Time/24.0)*550.0;
            Time -= Math.floor(Time/24.0)*24.0;
        }
        if (Time <= 6.0) {
            if ((Time-Math.floor(Time)) > (30.0/60.0))
                Time = Math.ceil(Time);
            else
                Time = Math.floor(Time);
            fee += Time*20;
        }
        else if (Time > 6.0) {
            if ((Time-Math.floor(Time)) > (20.0/60.0))
                Time = Math.ceil(Time);
            else
                Time = Math.floor(Time);
            fee += (6.0*20.0) + ((Time-6.0)*30.0);
        }
        System.out.println("\nFee = " + fee + " baht.");
    }
}
