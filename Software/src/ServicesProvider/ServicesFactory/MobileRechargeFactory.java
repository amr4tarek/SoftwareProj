package ServicesProvider.ServicesFactory;

import ServicesProvider.IProvider;
import ServicesProvider.Mobile.MobEtisalat;
import ServicesProvider.Mobile.MobOrange;
import ServicesProvider.Mobile.MobVodafone;
import ServicesProvider.Mobile.MobWe;

public class MobileRechargeFactory implements IServices {

    @Override
    public IProvider getService(int choice, double amount) {
        switch (choice) {
            case 1 : {
                return new MobVodafone(amount, true);
            }
            case 2 : {
                return new MobEtisalat(amount, false);
            }
            case 3 : {
                return new MobOrange(amount, true);
            }
            case 4 : {
                return new MobWe(amount, false);
            }
            default : {
                return null;
            }
        }
    }
}
