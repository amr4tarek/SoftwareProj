import Menus.HomeMenu;
import Refund.RefundHandler;
import UserAdmin.AuthenInfo;
import UserAdmin.Authentication;


public class Main {
    public static void main(String[] args) {
        String adminEmail = "software.com";
        String password = "1234";

        AuthenInfo adminInfo = new AuthenInfo(adminEmail, password);
        Authentication authentication = new Authentication(adminInfo);
        RefundHandler refundHandler = new RefundHandler();

        new HomeMenu().display(authentication, refundHandler);
    }
}
