package HW1;

/**
 *
 * @author firstName lastName ID:1234567
 */
public class HW1Task3 {

    /**
     * Checks to see if two numbers have the same digits without regard for
     * the number of times a digit appears.
     * @param a The first of the two numbers.
     * @param b The second number.
     * @return True if the numbers have the same digits, false otherwise.
     * For example a = 1123 and b = 3221 returns true, but a = 123 and b = 124
     * returns false;
     */
    public static boolean sameDigits(int a, int b){
        String num1Str = Integer.toString(a);
        String num2Str = Integer.toString(b);

        // בדיקה אם כל ספרה חוזרת על עצמה במספר הראשון או השני
        for (char digit = '0'; digit <= '9'; digit++) {
            if (num1Str.indexOf(digit) != num1Str.lastIndexOf(digit) ||
                    num2Str.indexOf(digit) != num2Str.lastIndexOf(digit)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Tests the sameDigits method.
     * @param args these parameters are not used.
     */
    public static void main(String[] args) {
        System.out.println(sameDigits(15474, 7451));
        System.out.println(!sameDigits(784, 674));
        System.out.println(sameDigits(7684, -46784));
    }

}
