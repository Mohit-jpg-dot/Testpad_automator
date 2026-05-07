/*
 * Complete the function countDigits
 * @params
 *   number -> integer , whose digits are to be calculated
 * @returns
 *   integer, number of digits in the number
 */
public int countDigits(int number){
    int sum=0;
    while(number>0){
        sum++;
        number/=10;
    }
    return sum;
}