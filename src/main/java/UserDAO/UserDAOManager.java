package UserDAO;

import UserClass.User;

public class UserDAOManager implements UserDAOInterface{
    @Override
    public void storeUser(User user) {
        user.storeDB(user);
    }
}
