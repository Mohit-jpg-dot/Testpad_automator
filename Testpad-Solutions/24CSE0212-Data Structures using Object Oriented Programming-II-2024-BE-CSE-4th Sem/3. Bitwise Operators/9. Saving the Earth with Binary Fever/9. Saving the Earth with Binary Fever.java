class Result {
  // Return the minimum number of jumps 
  static int getMinJumps(long n) {
    return Long.bitCount(n);
  }
}