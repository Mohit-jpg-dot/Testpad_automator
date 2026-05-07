class MinMaxAccount extends BankAccount {
    private int min;
    private int max;
    public MinMaxAccount(int number, int bal) {
        super(number, bal);
        min = bal;
        max = bal;
    }
    public void deposit(int amt) {
        super.deposit(amt);
        update();
    }
    public void withdraw(int amt) {
        super.withdraw(amt);
        update();
    }
    private void update() {
        int curr = getBalance();
        if(curr < min) min = curr;
        if(curr > max) max = curr;
    }
    public int getMin() {
        return min;
    }
    public int getMax() {
        return max;
    }
}