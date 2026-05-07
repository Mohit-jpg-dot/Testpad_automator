import java.util.Scanner;
class TollBooth
{
    private int totalCars;
    private int totalCash;
    // Constructor
    public TollBooth()
    {
        totalCars = 0;
        totalCash = 0;
    }
    // Paying car
    public void payingCar()
    {
        totalCars++;
        totalCash += 50;
    }
    // Non-paying car
    public void nopayCar()
    {
        totalCars++;
    }
    // Display totals
    public void display()
    {
        System.out.println("Total Cash : " + totalCash + "/-");
        System.out.println("Total Cars : " + totalCars);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TollBooth tb = new TollBooth();
        while(true)
        {
            char ch = sc.next().charAt(0);
            if(ch == 'p')
                tb.payingCar();
            else if(ch == 'n')
                tb.nopayCar();
            else if(ch == 'q')
            {
                tb.display();
                break;
            }
        }
        sc.close();
    }
}