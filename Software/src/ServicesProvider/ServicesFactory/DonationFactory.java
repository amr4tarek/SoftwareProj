package ServicesProvider.ServicesFactory;
import ServicesProvider.Donation.CancerHospital;
import ServicesProvider.Donation.NGOs;
import ServicesProvider.Donation.Schools;
import ServicesProvider.IProvider;

public class DonationFactory implements IServices {
    @Override
    public IProvider getService(int choice, double amount) {
        switch (choice) {
            case 1 : {
                return new CancerHospital(amount, true);
            }
            case 2 : {
                return new NGOs(amount, true);
            }
            case 3 : {
                return new Schools(amount, true);
            }
            default : {
                return null;
            }
        }
    }
}
