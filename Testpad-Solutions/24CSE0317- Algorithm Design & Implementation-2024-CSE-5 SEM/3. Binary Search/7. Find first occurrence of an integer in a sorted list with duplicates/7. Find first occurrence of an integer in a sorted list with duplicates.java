import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int firstOccurence = -1;
            int low = 0, high = n-1;
            while(low <= high) {
                int mid = low + (high - low)/2;
                if(arr[mid] == k) {
                    firstOccurence = mid;
                    high = mid - 1;
                } else if(arr[mid] < k) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(firstOccurence);
        }
    }
}