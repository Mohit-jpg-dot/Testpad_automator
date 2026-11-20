class Result {
    static String itoa(int num) {
        if (num == 0) {
            return "0";
        }
        return itoaHelper(num);
    }
    private static String itoaHelper(int num) {
        if (num == 0) {
            return "";
        }
        return itoaHelper(num / 10) + (char) (num % 10 + '0');
    }
    static int atoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int firstDigit = str.charAt(0) - '0';
        return firstDigit * (int) Math.pow(10, str.length() - 1) + atoi(str.substring(1));
    }
}