package OOP;

class Account {
    private String password;

    public String getPassword() {
        setPassword("abcd");  //call setPassword and set the password before returning it, and make setPassword private to not let allow other people to change the password.
        return this.password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
    
}

public class G_AccessPrivateProperties {
    public static void main(String[] args) {
        Account a1 = new Account();
        // a1.setPassword("abcd");
        System.out.println(a1.getPassword());
    }
}
