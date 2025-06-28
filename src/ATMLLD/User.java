package ATMLLD;

public class User {


    private Account account;
    private final String accountNumber;
    private String password;
    public String name;
    // Follow encapsulation principle to keep accountNumber and password final
    public User(String accountNumber, String password, String name) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.name = name;

    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public Account getAccount() {
        return this.account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void updatePassword(String newPassWord) {
        this.password = newPassWord;
    }
}
