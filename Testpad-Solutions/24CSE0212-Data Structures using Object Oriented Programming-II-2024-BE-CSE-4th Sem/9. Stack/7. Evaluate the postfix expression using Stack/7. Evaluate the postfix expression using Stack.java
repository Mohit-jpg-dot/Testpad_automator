/* isEmpty(), isFull(), push(int) and int pop() functions available on Stack. */
static int evalPostfix(CQStack s, String exp) {
  // Write your code here
    for(int i=0;i<exp.length();i++){
          char ch = exp.charAt(i);
          if(Character.isDigit(ch)){
              s.push(ch - '0');
          }else {
              int b=s.pop();
              int a=s.pop();
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