class Bill {
   Bill(){
   }
}
class Cash extends Bill{
   int n2000, n500, n100, n50, n10;
   int cash;
   int price ;
   int q;
   int bill;
    void get_cash(){
        Scanner sc = new Scanner(System.in);
        price = sc.nextInt();
        q = sc.nextInt();
        n2000 = sc.nextInt();
        n500 = sc.nextInt();
        n100 = sc.nextInt();
        n50 = sc.nextInt();
        n10 = sc.nextInt();
        cash = (n2000*2000) + (n500*500) + (n100*100) + (n50*50) + (n10*10);
        bill = price *q;
    }
    void display(){
     if(cash == bill)
        {
            System.out.println("Clear");
        }
        else if(cash < bill)
        {
            System.out.println("Need to pay: " + (bill - cash));
        }
        else
        {
            System.out.println("Clear");
        }
 }
}