import java.util.ArrayList;
class Solve {
    // The first argument is the number of bits. You need to save all binary strings in the ArrayList passed as 4th argument named strs.
    // Dont print the strings as they will be printed after needed processing (sorting in ascending order) at back end.
    // i is initially passed as 0, currStr is a char array to store the current String.
    void generateAllStrings ( int n , int i , char currStr [], ArrayList < String > strs ){
        // Base case: if we have filled all bits, add the string to the list
        if (i == n) {
            strs.add(new String(currStr));
            return;
        }
        // Try placing '0' at the current position
        currStr[i] = '0';
        generateAllStrings(n, i + 1, currStr, strs);
        // Try placing '1' at the current position
        currStr[i] = '1';
        generateAllStrings(n, i + 1, currStr, strs);
    }
}