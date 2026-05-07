import java.util.Scanner;
// Other imports go here
// Do NOT change the class name and method signature
class Main
{
  static boolean isHappy(int n) 
  {
    // Write your code here
      if(n == 1) return true;
      if(n <= 0 || n == 4) return false;
      int sum = 0;
      while(n > 0){
          sum += (n%10)*(n%10);
          n = n/10;
      }
      return isHappy(sum);
  }