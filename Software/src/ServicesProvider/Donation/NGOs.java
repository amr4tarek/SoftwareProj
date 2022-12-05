package ServicesProvider.Donation;

import ServicesProvider.IProvider;

public class NGOs extends IProvider {

    public NGOs(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "NGOs";
    }
}
