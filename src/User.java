public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String userName;
    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAdress){
        this.emailAddress = emailAdress;
    }

    public String getEmailAddress(){ return this.emailAddress; }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
