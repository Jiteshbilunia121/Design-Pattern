package ATMLLD;


import java.beans.JavaBean;

@JavaBean
public class TransactionService{
    private User user;



    public String withdraw(User user, int amount){
       user.getAccount().withdraw(user, amount);
       return "WithDrawn Successfully";

    }
    public String Deposit(User user, int amount) {
        user.getAccount().withdraw(user, amount);

        return "Deposited successfully";
    }

}
