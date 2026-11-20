class Result{
  // Return true if the str2 is a subsequence of str1, else return false
  static boolean strSubsequence(String str1, String str2) {
    // Write your code here
    int left = 0;
    int right = 0;
    while(right < str1.length() && left < str2.length()) {
        if(str2.charAt(left) == str1.charAt(right)) {
            left++;
        } 
        right++;
    }
    return left == str2.length();
  }
}