package UserClass;
import Classes.enums.UserType;

public abstract class User {

    // Attributes
    private UserType userType = UserType.NONE;
    private String name, email ;
    private int id;
    //End of Attributes --------------------------

    // Constructors
    public User(String name, String email, UserType userType){
        setName(name);
        setEmail(email);
        setUserType(userType);
    }

    public User() {

    }
    // End of Constructors --------------------

    // Setters && Getters

    public abstract void storeDB();
    public abstract void deleteDB(User user);
    public abstract void updateDB(User user);
    public abstract void readDB(User user);
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public abstract  UserType getUserType() ;

    public void setName(String Name){
        this.name = Name ;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        //retrieve the ID made from the DB
    }
    public int getId() {
        return id;
    }

    //End of Setters & Getters -------------------
    // Random Fucntions
    // End of Random Functions

}
