class Result{ 
    static int decimalToBinary(int n){ 
        if(n==0){
            return 0;
        }
        return decimalToBinary(n/2)*10+(n%2);
    } 
}