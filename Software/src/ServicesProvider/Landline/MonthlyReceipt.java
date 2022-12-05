package ServicesProvider.Landline;

import ServicesProvider.IProvider;

public class MonthlyReceipt extends IProvider {
    public double price;
    public boolean is_cash;

    public MonthlyReceipt(double price, boolean is_cash) {
        this.price = price;
        this.is_cash = is_cash;
        this.name = "WE Monthly";
    }
}
