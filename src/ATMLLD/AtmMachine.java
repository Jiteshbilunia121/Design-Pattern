package ATMLLD;


import java.util.List;

public class AtmMachine {
    private static final List<Integer> ACCEPTED_DENOMINATIONS = List.of(100, 200, 500, 1000, 2000);
    private final TransactionService transactionService;

    public AtmMachine(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public String authenticateUser(String inputPassword, User user) {
        return user.getPassword().equals(inputPassword) ? "Login successful" : "Invalid credentials";
    }

    public String deposit(User user, int amount) {
        return transactionService.Deposit(user, amount);
    }

    public String withDraw(User user, int amount) {
        return transactionService.withdraw(user, amount);
    }
}
