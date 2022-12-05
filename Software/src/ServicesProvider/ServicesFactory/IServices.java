package ServicesProvider.ServicesFactory;

import ServicesProvider.IProvider;

public interface IServices {
    IProvider getService(int choice, double amount);
}
