package ATMLLD;

public class Account {
    public enum type{
        SAVINGS,
        CURRENT,

    }
    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    private int balance;


    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(User user, int amount) {
        int balance = user.getAccount().getBalance();
        if(amount <= balance){
            balance -= amount;

            // Some logic\\

            return true;
        }

        try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }


}
