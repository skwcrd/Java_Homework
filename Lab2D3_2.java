import java.util.Scanner;
public class Lab2D3_2 {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double fee=0,Time,TimeIn,TimeOut,day;
        System.out.print("Enter DAY [IN] >> ");
        day = scan.nextDouble();
        System.out.print("Enter TIME [IN] >> ");
        Time = scan.nextDouble();
        TimeIn = (day*24.0)+Math.floor(Time)+(((Time-Math.floor(Time))*100)/60);
        System.out.print("Enter DAY [OUT] >> ");
        day = scan.nextDouble();
        System.out.print("Enter TIME [OUT] >> ");
        Time = scan.nextDouble();
        TimeOut = (day*24.0)+Math.floor(Time)+(((Time-Math.floor(Time))*100)/60);
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
