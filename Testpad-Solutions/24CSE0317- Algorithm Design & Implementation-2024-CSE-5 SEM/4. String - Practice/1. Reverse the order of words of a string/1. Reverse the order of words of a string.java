class Result {
  static String revWordsOrder(String str) {
    // Write your code here
    if(str == null || str.isEmpty()) {
        return str;
    }
    String[] words = str.trim().split("\\s+");
    StringBuilder reversed = new StringBuilder();
      for(int i=words.length-1; i>=0; i--) {
          reversed.append(words[i]);
          if(i>0) {
              reversed.append(" ");
          }
      }
      return reversed.toString();
  }
}