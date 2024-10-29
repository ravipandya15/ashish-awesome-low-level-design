package onlinestockbrokeragesystem;

public class BuyOrder extends Order {
    public BuyOrder(String orderId, Account account, Stock stock, int quantity, double price) {
        super(orderId, account, stock, quantity, price);
    }

    @Override
    public void execute() {
        double totalCost = quantity * price;
        if (account.getBalance() >= totalCost) {
//            account.withdraw(totalCost);
            // Update portfolio and perform necessary actions

            // ******   Added By Me *************  --> it should be in @Transactional block os if 2nd statement failed then first will roll back
            this.account.withdraw(this.stock.getPrice() * quantity);
            this.account.getPortfolio().addStock(this.stock, quantity);
            // ******   Added By Me *************

            status = OrderStatus.EXECUTED;
        } else {
            status = OrderStatus.REJECTED;
            throw new InsufficientFundsException("Insufficient funds to execute the buy order.");
        }
    }
}
