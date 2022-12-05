package Payment;

import ServicesProvider.IProvider;
import UserAdmin.User;

public class WalletPayment extends IPayment {
    @Override
    public boolean pay(User user, IProvider servicesProvider) {
        System.out.println(" Payment has been Done Using Wallet for" + servicesProvider.name + "with money amount:" + servicesProvider.amount);
        return true;
    }
}
