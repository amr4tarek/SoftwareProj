package ServicesProvider.Mobile;

import ServicesProvider.IProvider;

public class MobVodafone extends IProvider {
    public MobVodafone(double price, boolean is_cash) {
        this.amount = price;
        this.is_cash = is_cash;
        this.name = "Mobile Vodafone";
    }
}
