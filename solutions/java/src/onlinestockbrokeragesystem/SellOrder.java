package onlinestockbrokeragesystem;

public class SellOrder extends Order {
    public SellOrder(String orderId, Account account, Stock stock, int quantity, double price) {
        super(orderId, account, stock, quantity, price);
    }

    @Override
    public void execute() {
        // Check if the user has sufficient quantity of the stock to sell
        // Update portfolio and perform necessary actions

        // ******   Added By Me ************* ->  it should be in @Transactional block os if 2nd statement failed then first will roll back
//        first check if this account contains this stock or not
        if (this.account.getPortfolio().getHoldings().containsKey(this.stock.getSymbol())) {
            this.account.deposit(this.price * quantity);
            this.account.getPortfolio().removeStock(stock, quantity);
        } else {
            throw new InsufficientStockException("portfolio doesnot contain stock: " + this.stock.getSymbol());
        }

        // ******   Added By Me *************

//        double totalProceeds = quantity * price;
//        account.deposit(totalProceeds);
        status = OrderStatus.EXECUTED;
    }
}
