package Lab5D3;

public class Exercise1_Deposit {
    final double INT1 = 0.05,INT2 = 0.2,INT3 = 0.35;
    public double CalINT_1 (double money,double year) {
        double interest=0.0;
        if (year >= 1.0 && year < 5.0)
            interest = money * INT1;
        else if (year >= 5.0 && year <= 10.0)
            interest = money * INT2;
        else if (year > 10.0)
            interest = money * INT3;
        return interest;
    }

    public double CalINT_2 (double money,double year) {
        double interest=0.0;
        if (year >= 1.0 && year < 5.0)
            interest = money * INT1 * year;
        else if (year >= 5.0 && year <= 10.0)
            interest = money * INT2 * year;
        else if (year > 10.0)
            interest = money * INT3 * year;
        return interest;
    }

    public double CalINT_3 (double money,double year) {
        double interest=0.0;
        if (year > 10.0) {
            interest += money * INT3 * (year - 10.0);
            year = 10.0;
        }
        if (year >= 5.0 && year <= 10.0) {
            interest += money * INT2 * (year - 4.0);
            year = 4.0;
        }
        if (year >= 1.0 && year < 5.0)
            interest += money * INT1 * year;
        return interest;
    }
}
