class Result {
  static int countWords(String str) {
    // Write your code here
    if(str == null || str.trim().isEmpty()) {
        return 0;
    }
    String[] words = str.trim().split("\\s+");
    return words.length;
  }
}