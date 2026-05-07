class Writer
{
  private String name,email;
    private char gender;
    public Writer(String name,String email,char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }
    @Override
    public String toString(){
        return "Writer[name=" + this.name + ",email=" + this.email + ",gender=" + this.gender + "]";
    }
}
class Book
{
  private String name;
    private Writer writer;
    private double price;
    private int qty;
    public Book(String name, Writer writer, double price){
        this.name = name;
        this.writer = writer;
        this.price = price;
    }
    public Book(String name, Writer writer, double price,int qty){
        this.name = name;
        this.writer = writer;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    @Override
    public String toString(){
        return "Book[name=" + this.name + "," + this.writer.toString() + ",price=" + this.price + ",qty=" + this.qty;
    }
}