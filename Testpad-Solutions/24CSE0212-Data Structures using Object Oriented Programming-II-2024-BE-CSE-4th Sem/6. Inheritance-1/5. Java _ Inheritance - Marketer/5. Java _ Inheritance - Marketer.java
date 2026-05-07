class Marketers extends Employee {
    public Marketers() {
        setBaseSalary(0);
    }
    public int getSalary(){
        return super.getSalary()+5000;
    }
    public void message(){
        System.out.println("CodeQuotient - Get better at coding");
    }
}