package ServicesProvider.ServicesFactory;

import ServicesProvider.IProvider;
import ServicesProvider.Internet.InternetEtisalat;
import ServicesProvider.Internet.InternetOrange;
import ServicesProvider.Internet.InternetVodafone;
import ServicesProvider.Internet.InternetWe;

public class InternetFactory implements IServices {
    @Override
    public IProvider getService(int choice, double amount) {
        switch (choice) {
            case 1 : {
                return new InternetVodafone(amount, true);
            }
            case 2 : {
                return new InternetEtisalat(amount, true);
            }
            case 3 : {
                return new InternetOrange(amount, true);
            }
            case 4 : {
                return new InternetWe(amount, true);
            }
            default : {
                return null;
            }
        }
    }
}
