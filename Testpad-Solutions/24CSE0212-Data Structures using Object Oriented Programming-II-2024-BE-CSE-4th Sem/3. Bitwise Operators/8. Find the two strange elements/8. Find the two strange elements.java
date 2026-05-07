class Result{
  static void printStrangeElements(int[] arr, int n) {
      int xor = 0;
      // Step 1: XOR all elements
      for(int i = 0; i < n; i++) {
          xor ^= arr[i];
      }
      // Step 2: Get rightmost set bit
      int setBit = xor & -xor;
      int num1 = 0, num2 = 0;
      // Step 3: Divide into two groups
      for(int i = 0; i < n; i++) {
          if((arr[i] & setBit) != 0)
              num1 ^= arr[i];
          else
              num2 ^= arr[i];
      }
      // Step 4: Print in ascending order
      if(num1 < num2)
          System.out.println(num1 + " " + num2);
      else
          System.out.println(num2 + " " + num1);
  }
}