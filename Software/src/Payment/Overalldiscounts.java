package Payment;
import ServicesProvider.IProvider;
import UserAdmin.User;
public class Overalldiscounts extends DiscountDecorator {

    
    @Override
    public IPayment setDiscount(IPayment P) {
        P.cost = P.cost - discount*P.cost/100;
        System.out.println("Discount has been set for all services.");
        return P;
    }
    @Override
    public IPayment getDiscount(IPayment P) {
        System.out.println("Discount is:"+ P.cost);
        return P;
    }
    @Override
    public boolean pay(User user, IProvider servicesProvider) {
        // TODO Auto-generated method stub
        return false;
    }
}
