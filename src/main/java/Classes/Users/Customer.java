package Classes.Users;
import Classes.enums.UserType;
import UserClass.User;

public class Customer extends User {
    UserType userType = UserType.CUSTOMER ;


    @Override
    public UserType getUserType() {
        return userType;
    }
    public Customer(int id){}
    public Customer(String name, String email){}
    public Customer(int id, String name, String email){}
    public Customer (){}

    @Override
    public void storeDB(User user) {
        System.out.println("Store customer information");

    }
}
