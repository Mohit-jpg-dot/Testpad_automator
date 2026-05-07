class Customer {
    private int id;
    private String name;
    private int discount;
    // Constructor
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    // Getters
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    // Setter
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    // toString
    public String toString() {
        return name + "(" + id + ")";
    }
}
class Bill {
    private int id;
    private Customer customer;
    private double amount;
    // Constructor
    public Bill(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    // Getters
    public int getID() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
    // Setters
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    // Extra methods
    public int getCustomerID() {
        return customer.getID();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    // Final amount after discount
    public double getFinalAmt() {
        return amount - (amount * customer.getDiscount() / 100.0);
    }
}