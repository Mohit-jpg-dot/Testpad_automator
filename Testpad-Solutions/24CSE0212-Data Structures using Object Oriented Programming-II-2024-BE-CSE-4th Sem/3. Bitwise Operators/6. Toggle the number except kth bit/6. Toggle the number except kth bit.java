class Result{
  static int toggleExceptKthBit(int n,int k){
      int toggled = ~n;  // toggle all bits
      int kthBit = (n >> k) & 1;  // original kth bit
      if(kthBit == 1){
          toggled |= (1 << k);   // set kth bit
      } else {
          toggled &= ~(1 << k);  // clear kth bit
      }
      return toggled;
  }
}