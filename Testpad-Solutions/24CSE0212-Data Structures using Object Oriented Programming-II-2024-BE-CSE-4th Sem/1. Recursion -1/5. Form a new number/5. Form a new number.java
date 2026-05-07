import java.util.Scanner;
class Main {
    int evenDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int lastDigit = n % 10;
        int remaining = evenDigits(n / 10);
        if (lastDigit % 2 == 0) {
            return remaining * 10 + lastDigit;
        } else {
            return remaining;
        }
    }
    public static void main(String[] args) {
        int T, no;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        Main obj = new Main(); // create instance
        while (T-- > 0) {
            no = sc.nextInt();
            System.out.println(obj.evenDigits(no));
        }
    }
}