package account;

public class Account {
    private String id;
    private String customerID;
    private String username;
    private String password;
    public Account(String id, String customerID, String username, String password) {
        this.id = id;
        this.customerID = customerID;
        this.username = username;
        this.password = password;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean checkLogin(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }else {
            return false;
        }
    }
    
}
