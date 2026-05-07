class Customer {
    private int id;
    private String name;
    private char gender;
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name + "(" + id + ")";
    }
}
class BankAccount {
    private int id;
    private Customer customer;
    private double balance;
    public BankAccount(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public int getID() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return customer.toString() + " balance=INR " + String.format("%.2f", balance);
    }
    // Deposit
    public void deposit(double amount) {
        balance += amount;
    }
    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}