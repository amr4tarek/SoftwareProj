package Payment;

import UserAdmin.User;
import ServicesProvider.IProvider;


public abstract class IPayment {
    float cost;
    public abstract boolean pay(User user, IProvider servicesProvider);
}
