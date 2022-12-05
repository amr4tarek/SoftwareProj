package ServicesProvider.ServicesFactory;
import ServicesProvider.IProvider;
import ServicesProvider.Landline.MonthlyReceipt;
import ServicesProvider.Landline.QuarterReceipt;

public class LandlineFactory implements IServices {

    @Override
    public IProvider getService(int choice, double amount) {
        switch (choice) {
            case 1 : {
                return new MonthlyReceipt(amount, false);
            }
            case 2 : {
                return new QuarterReceipt(amount, false);
            }
            default : {
                return null;
            }
        }
    }
}
