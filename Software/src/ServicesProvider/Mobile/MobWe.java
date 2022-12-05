package ServicesProvider.Mobile;

import ServicesProvider.IProvider;

public class MobWe extends IProvider {
    public MobWe(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "Mobile WE";
    }
}
