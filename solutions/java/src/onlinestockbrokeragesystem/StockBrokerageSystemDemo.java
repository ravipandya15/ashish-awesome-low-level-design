package onlinestockbrokeragesystem;

public class StockBrokerageSystemDemo {
    public static void main(String[] args) {
        StockBroker stockBroker = StockBroker.getInstance();

        // Create user and account
        User user = new User("U001", "John Doe", "john@example.com");
//        stockBroker.createAccount(user, 10000.0);
        stockBroker.createAccount(user, 50000.0);
        Account account = stockBroker.getAccount("A001");

        System.out.println("Initial Balance: $" + account.getBalance());

        // Add stocks to the stock broker
        Stock stock1 = new Stock("AAPL", "Apple Inc.", 1500.0);
        Stock stock2 = new Stock("GOOGL", "Alphabet Inc.", 2000.0);
        stockBroker.addStock(stock1);
        stockBroker.addStock(stock2);

        // Place buy orders
        Order buyOrder1 = new BuyOrder("O001", account, stock1, 10, 1500.0);
        Order buyOrder2 = new BuyOrder("O002", account, stock2, 5, 2000.0);
        stockBroker.placeOrder(buyOrder1);
        stockBroker.placeOrder(buyOrder2);

        System.out.println("Account Balance after buy: $" + account.getBalance());

        // Place sell orders
        Order sellOrder1 = new SellOrder("O003", account, stock1, 5, 1600.0); // ideally In need to update stock price, like increasePrice() and decreasePrice() method or only updatePrice() Method
        stockBroker.placeOrder(sellOrder1);

        // Print account balance and portfolio
        System.out.println("Final Account Balance after sell: $" + account.getBalance());
        System.out.println("Portfolio: " + account.getPortfolio().getHoldings());
    }
}
