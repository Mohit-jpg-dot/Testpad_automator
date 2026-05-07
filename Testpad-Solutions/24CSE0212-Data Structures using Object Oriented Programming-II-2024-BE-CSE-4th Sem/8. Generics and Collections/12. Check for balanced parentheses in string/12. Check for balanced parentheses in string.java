import java.util.*;
class Result{
  static int balancedString(String s){
    // Write your code here
      Stack<Character> st= new Stack<>();
      Stack<Integer> ind= new Stack<>();
      int n= s.length();
      for(int i=0;i<n;i++){
          char ch = s.charAt(i);
          if(ch == '(' || ch == '{'){
              st.push(ch);
              ind.push(i);
          }
          else if(ch==')' || ch == '}'){
              if(st.isEmpty()){
                  return i;
              }
              char top=st.pop();
              ind.pop();
              if(ch == ')' && top != '(' ||
                ch == '}' && top != '{' ){
                  return i;
              }
          }
      }
      if(!st.isEmpty()) return s.length();
      return -1;
  }
}