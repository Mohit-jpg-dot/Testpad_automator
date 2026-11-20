class Result {
    static String[] ones = {
        "zero", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    static String[] tens = {
        "", "", "twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    static void intToWord(int n) {
    // Write your code here
 if (n == 0) {
            System.out.print("zero");
            return;
        }
        if (n >= 100000) {
            System.out.print(ones[n / 100000] + " lakhs");
            n = n % 100000;
            if (n > 0) System.out.print(" ");
        }
        if (n >= 1000) {
            int x = n / 1000;
            if (x < 20) {
                System.out.print(ones[x] + " thousand");
            } else {
                System.out.print(tens[x / 10]);
                if (x % 10 != 0) {
                    System.out.print(" " + ones[x % 10]);
                }
                System.out.print(" thousand");
            }
            n = n % 1000;
            if (n > 0) System.out.print(" ");
        }
        if (n >= 100) {
            System.out.print(ones[n / 100] + " hundred");
            n = n % 100;
            if (n > 0) System.out.print(" ");
        }
        if (n >= 20) {
            System.out.print(tens[n / 10]);
            n = n % 10;
            if (n > 0) {
                System.out.print(" " + ones[n]);
            }
        } else if (n > 0) {
            System.out.print(ones[n]);
        }
  }
}