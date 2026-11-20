import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static int rotationCount(int[] arr, int size) {
        if(arr[0] <= arr[size-1]) {
            return -1;
        }
        int low =0, high = size-1;
        while(low <= high) {
            if(arr[low] <= arr[high]) {
                return low;
            }
            int mid = low + (high - low)/2;
            int next = (mid + 1)%size;
            int prev = (mid - 1 + size)%size;
            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
                return mid;
            }
            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
        }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = rotationCount(arr, n);
            System.out.println(result);
        }
    }
}