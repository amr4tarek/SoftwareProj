package ServicesProvider.Internet;

import ServicesProvider.IProvider;

public class InternetWe extends IProvider {
    public InternetWe(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "Internet WE";
    }
}
