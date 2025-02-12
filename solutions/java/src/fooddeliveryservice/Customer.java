package fooddeliveryservice;

// use inheritance
//User -> id, name, email, phone No.
//Customer extends User
//DeliveryAgent extends User
//DeliveryAgent has extra fields. ex. isAvailable
public class Customer {
    private final String id;
    private final String name;
    private final String email;
    private final String phone;

    public Customer(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }
}
