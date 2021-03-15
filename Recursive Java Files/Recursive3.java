package recursive;

public class Recursive3 {

    public static boolean isLucky(int number) // assume n >= 1
    {
        int lastDigit = number % 10;
        if (lastDigit == 8) {
            return true;
        } else if (number > 9) {
            return isLucky(number / 10);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(Recursive3.isLucky(88));
    }
}
