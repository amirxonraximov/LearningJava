package Codewars;

public class SquareDigit {
    public int squareDigits(int n) {
        if (n == 0)
            return 0;
        String result = "";
        while (n > 0) {
            int r = n % 10;
            r *= r;
            result = String.valueOf(r) + result;
            n /= 10;
        }
        return Integer.parseInt(result);
    }
}