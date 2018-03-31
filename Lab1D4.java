public class Lab1D4 {
    public static void main(String[] args) {
        final double dist = 450.0;
        double oil,hour,minute,rate,speed;
        oil = 28.0; //28.0, 35.0, 25.0
        hour = 5.0; //5.0, 4.0, 5.0
        minute = 15.0; //15.0, 40.0, 37.0
        rate = dist/oil;
        speed = dist/(hour+(minute/60.0));
        System.out.print("Rate Oil = " + rate + "\nSpeed = " + speed);
    }
}
