/* class CQStack{
      public CQStack(int s) // constructor
      public void push(int j) // put item on top of stack
      public int pop() // take item from top of stack
      public boolean isEmpty() // true if stack is empty
      public boolean isFull() // true if stack is full
    }
    CQStack class already defined as per the above blueprint
*/
class Result {
  static int evalPrefix(CQStack s, String exp) {
    // Write your code here
      for(int i=exp.length()-1;i>=0;i--){
          char ch = exp.charAt(i);
          if(Character.isDigit(ch)){
              s.push(ch - '0');
          }else {
              int a=s.pop();
              int b=s.pop();
              int res=0;
              if(ch == '+'){
                  res = a+b;
              }else if(ch  == '-'){
                  res = a-b;
              }else if(ch  == '*'){
                  res = a*b;
              }else if(ch  == '/'){
                  res = a/b;
              }else if(ch  == '^'){
                  res = (int)Math.pow(a,b);
              }
              s.push(res);
          }
       }
      return s.pop();
  }
}