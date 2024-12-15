package Administrator;
import UserClass.User;

import Administrator.AdminInterfaces.AdminInterfaceManager;
import Classes.enums.UserType;

public class Admin extends User {

        // Variables initialization
        AdminInterfaceManager manager = new AdminInterfaceManager();
        UserType userType = UserType.ADMIN ;
        AdminInterfaceManager adminInterfaceManager = new AdminInterfaceManager();
        // Variables END

        public Admin(String name, String email) {
            super(name, email, UserType.ADMIN);
        }

        public Admin() {
//            adminInterfaceManager.printInterface();
            System.out.println("Hello neggga");
        }

    @Override
    public void storeDB(User user) {
        System.out.println("NEGGGGGGGGGGGGGGGGA");
    }

    @Override
        public UserType getUserType() {
            return userType;
        }

        // build  tostring function



}
