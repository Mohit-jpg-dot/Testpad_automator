class Result{
  static void printNextGreaterElement(int arr[], int n)
{
    for(int i = 0; i < n; i++)
    {
        int next = -1;
        for(int j = i + 1; j < n; j++)
        {
            if(arr[j] > arr[i])
            {
                next = arr[j];
                break;
            }
        }
        System.out.print(next + " ");
    }
}
}