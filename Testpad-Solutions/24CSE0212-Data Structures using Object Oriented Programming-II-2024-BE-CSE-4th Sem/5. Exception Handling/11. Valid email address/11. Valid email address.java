import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner s1 = new Scanner(System.in);
    String id = s1.nextLine();
    try
    {
        int atIndex = id.indexOf('@');
        int dotIndex = id.lastIndexOf('.');
        if(atIndex == -1)
            throw new Exception();
        if(dotIndex == -1)
            throw new Exception();
        if(dotIndex < atIndex)
            throw new Exception();
        System.out.println("Valid");
    }
    catch(Exception e)
    {
        System.out.println("Invalid");
    }
  }
}