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
            int left = 0;
            int right = n-1;
            int l =0;
            int r = n-1;
            int firstOccurence = -1;
            int lastOccurence = -1;
            while(left <= right) {
                int mid = left + (right-left)/2;
                if(arr[mid] == k) {
                    firstOccurence = mid;
                    right = mid - 1;
                } else if(arr[mid] < k) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            while(l <= r) {
                int mid = l + (r-l)/2;
                if(arr[mid] == k) {
                    lastOccurence = mid;
                    l = mid + 1;  
                } else if(arr[mid] < k) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        if (firstOccurence == -1) {
            System.out.println(0);
        } else {
            System.out.println((lastOccurence - firstOccurence) + 1);
        }
       }
    }
}