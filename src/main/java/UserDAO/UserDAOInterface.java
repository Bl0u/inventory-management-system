package UserDAO;

import UserClass.User;

public interface UserDAOInterface {

    public void storeUser(User user);
    public void getUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);
}
