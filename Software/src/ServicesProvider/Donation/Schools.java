package ServicesProvider.Donation;

import ServicesProvider.IProvider;

public class Schools extends IProvider {
    public Schools(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "Schools Donation";
    }
}
