package UserAdmin;

import java.util.Objects;

public class AuthenInfo {
    public String email;
    public String password;

    public AuthenInfo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean is_equal(AuthenInfo accountAuthenInfo) {
        return Objects.equals(accountAuthenInfo.email, email) && Objects.equals(accountAuthenInfo.password, password);
    }
}