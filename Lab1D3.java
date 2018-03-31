public class Lab1D3 {
    public static void main(String[] args) {
        final double VAT_RATE = 0.07;
        double price,Price_VAT;
        price = 19900.0; //19900.0, 18900.0, 7990.0
        Price_VAT = price+(price*VAT_RATE); //Price includes vat
        System.out.print("Price includes vat = " + Price_VAT + " baht.");
    }
}
