import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static int sumOfDigits(int t){
        if(t<0){
            return -sumOfDigits(-t);
        }else{
            if(t==0) return 0;
            return (t%10) + sumOfDigits(t/10);
        }
    }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            int t = sc.nextInt();
            System.out.println(sumOfDigits(t));
        }
        sc.close();
    }
}