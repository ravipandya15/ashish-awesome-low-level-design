package onlinestockbrokeragesystem;

public class Account {
    private final String accountId;
    private final User user;
    private double balance;
    private final Portfolio portfolio;

    public Account(String accountId, User user, double initialBalance) {
        this.accountId = accountId;
        this.user = user;
        this.balance = initialBalance;
        this.portfolio = new Portfolio(this);
    }

    public synchronized void deposit(double amount) {
        System.out.println("amount deposited by: " + amount);
        balance += amount;
        System.out.println("balance after deposit: " + this.balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            System.out.println("amount withdraw by: " + amount);
            balance -= amount;
            System.out.println("balance after withdraw: " + this.balance);
        } else {
            throw new InsufficientFundsException("Insufficient funds in the account.");
        }
    }

    public String getAccountId() {
        return accountId;
    }

    public User getUser() {
        return user;
    }

    public double getBalance() {
        return balance;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
}
