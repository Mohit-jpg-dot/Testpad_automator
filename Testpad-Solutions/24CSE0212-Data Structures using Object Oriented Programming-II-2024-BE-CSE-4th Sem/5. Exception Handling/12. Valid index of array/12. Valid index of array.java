import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int query = sc.nextInt();
        while(query-- > 0){
            int inp = sc.nextInt();
            try{
                System.out.println(arr[inp]);
            }
            catch(ArrayIndexOutOfBoundsException ae){
                System.out.println("Out of Bounds");
            }
        }
    }
}