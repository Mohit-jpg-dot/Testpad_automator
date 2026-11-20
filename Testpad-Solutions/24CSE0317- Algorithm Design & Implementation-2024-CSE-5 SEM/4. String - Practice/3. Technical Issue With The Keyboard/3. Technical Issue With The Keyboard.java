class Result {
  // Return the updated string
  static String getDesiredString(String str) {
    // Write your code here
    if(str == null || str.length() == 0) return str;
    StringBuilder sb = new StringBuilder();
    sb.append(str.charAt(0));
    for(int i=1; i<str.length(); i++) {
        if(str.charAt(i) != str.charAt(i-1)) {
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
  }
}