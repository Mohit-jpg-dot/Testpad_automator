class Result
{
  static int minReversal(String expr){
    // Write your code here
      int n = expr.length();
      if(n%2!=0) return -1;
      int open =0;
      int close =0;
      for(int i=0;i<n;i++){
          char ch = expr.charAt(i);
          if(ch == '[') open++;
          else{
              if(open > 0) open--;
              else close++;
          }
      }
      return (open+1)/2 + (close+1)/2;
  }
}