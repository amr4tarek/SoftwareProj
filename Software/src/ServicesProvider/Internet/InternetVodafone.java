package ServicesProvider.Internet;

import ServicesProvider.IProvider;

public class InternetVodafone extends IProvider {
    public InternetVodafone(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "Internet Vodafone";
    }
}
