class Writer
{
    private String name;
    private String email;
    private char gender;
    public Writer(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return "Writer[name="+name+",email="+email+",gender="+gender+"]";
    }
}
class Book
{
    private String name;
    private Writer[] writers;
    private double price;
    private int qty;
    public Book(String name,Writer[] writers,double price){
        this.name=name;
        this.writers=writers;
        this.price=price;
        this.qty=0;
    }
     public Book(String name,Writer[] writers,double price,int qty){
        this.name=name;
        this.writers=writers;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
    String result = "Book[name=" + name + ",Writers={";
    for(int i = 0; i < writers.length; i++){
        result += writers[i];
        if(i != writers.length - 1){
            result += ",";
        }
    }
    result += "},price=" + price + ",qty=" + qty ;
    return result;
}
}