package Payment;

import UserAdmin.User;
import ServicesProvider.IProvider;

public class CreditPayment extends IPayment {
    @Override
    public boolean pay(User user, IProvider servicesProvider) {
        System.out.println(" Payment has been Done Using Credit for" + servicesProvider.name + "with money amount:" + servicesProvider.amount);
        return true;
    }
    public void recharge(Wallet wallet, double amount) {
        wallet.add_value(amount);
    }
}
