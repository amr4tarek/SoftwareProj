package Payment;
import ServicesProvider.IProvider;
import UserAdmin.User;

public abstract class DiscountDecorator extends IPayment {
    int discount;

    public abstract IPayment setDiscount(IPayment P);
    public abstract IPayment getDiscount(IPayment P);
    @Override
    public boolean pay(User user, IProvider servicesProvider) {
        // TODO Auto-generated method stub
        return false;
    }
}
