package ServicesProvider.Internet;

import ServicesProvider.IProvider;

public class InternetEtisalat extends IProvider {
    public InternetEtisalat(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "Internet Etisalat";
    }
}
