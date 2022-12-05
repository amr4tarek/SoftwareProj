package ServicesProvider.Landline;

import ServicesProvider.IProvider;

public class QuarterReceipt extends IProvider {
    public QuarterReceipt(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "WE Quarter";
    }
}
