public class Lab1D2 {
    public static void main(String[] args) {
        double radius,area,length;
        radius = 5.0; //5.0, 3.7, 325.399
        area = Math.PI*Math.pow(radius,2);
        length = 2*Math.PI*radius;
        System.out.print("Circle area = " + area + " unit\nRounded circumference = " + length + " unit");
    }
}
