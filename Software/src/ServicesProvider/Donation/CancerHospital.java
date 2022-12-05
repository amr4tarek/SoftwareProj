package ServicesProvider.Donation;

import ServicesProvider.IProvider;

public class CancerHospital extends IProvider {
    public CancerHospital(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "Cancer Hospital";
    }
}