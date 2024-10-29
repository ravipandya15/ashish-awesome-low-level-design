package airlinemanagementsystem.payment;

public class Payment {
    private final String paymentId;
    private final String paymentMethod;
    private final double amount;
    private PaymentStatus status;
    // private String bookingNumber;  -> this payment is for which booking?

    public Payment(String paymentId, String paymentMethod, double amount) {
        this.paymentId = paymentId;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.status = PaymentStatus.PENDING;
    }

    public void processPayment() {
        // Process payment logic
        status = PaymentStatus.COMPLETED;
    }
}
