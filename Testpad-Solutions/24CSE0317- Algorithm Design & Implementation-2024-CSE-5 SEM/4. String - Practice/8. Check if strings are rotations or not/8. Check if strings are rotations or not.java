class Result {
  // return 1 for YES and 0 for NO.
  static int isRotation(String str1, String str2) {
    // Write your code here
     if (str1.length() != str2.length()) {
            return 0;
        }
        String temp = str2 + str2;
        if (temp.contains(str1)) {
            return 1;
        }
        return 0;
  }
}