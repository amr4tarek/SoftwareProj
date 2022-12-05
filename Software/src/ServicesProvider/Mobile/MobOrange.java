package ServicesProvider.Mobile;

import ServicesProvider.IProvider;

public class MobOrange extends IProvider {

    public MobOrange(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "Mobile Orange";
    }
}
