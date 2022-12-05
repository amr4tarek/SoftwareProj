package UserAdmin;

import java.util.Vector;

public class Authentication {
    public Authentication(AuthenInfo adminInfo) {
        this.admin = new Admin(adminInfo);
    }

    private Vector<User> users = new Vector<User>();
    private Admin admin;

    public boolean signupUser(AuthenInfo info, String userName) {
        int index = searchUser(info);
        if (index == -1) {
            User user = new User(info, userName);
            users.add(user);
            return true;
        } else return false;
    }

    public User loginUser(AuthenInfo info) {
        int index = searchUser(info);
        if (index != -1) {
            return users.get(index);
        } else return null;
    }

    private int searchUser(AuthenInfo info) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).authInfo.is_equal(info)) return i;
        }
        return -1;
    }

    public Admin loginAdmin(AuthenInfo info) {
        if (admin.authInfo.is_equal(info)) {
            return admin;
        } else return null;
    }
}