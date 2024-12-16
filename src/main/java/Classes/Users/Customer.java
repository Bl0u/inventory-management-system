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

    public void storeDB() {
        System.out.println(" Customer storeDB");
    }

    @Override
    public void deleteDB(User user) {

        System.out.println(" Customer deleteDP");
    }

    @Override
    public void updateDB(User user) {

        System.out.println(" Customer updateDB");
    }

    @Override
    public void readDB(User user) {

        System.out.println(" Customer readDB");
    }
}
