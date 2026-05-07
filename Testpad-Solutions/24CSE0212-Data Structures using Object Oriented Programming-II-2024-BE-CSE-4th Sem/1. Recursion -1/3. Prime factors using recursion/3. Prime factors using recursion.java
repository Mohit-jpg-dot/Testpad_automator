import java.util.*;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void prime(ArrayList<Integer> list,int n,int i){
       if(n==1){
           for(int j=0;j<list.size();j++){
               System.out.println(list.get(j));
           }
           return;
       }
       if(n%i==0){
           list.add(i);
           prime(list,n/i,i);
       }
        else{
            prime(list,n,i+1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        prime(list,n,2);
    }
}