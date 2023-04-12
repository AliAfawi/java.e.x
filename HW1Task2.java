package HW1;

/**
 *
 * @author FirstName lastName ID:1234567
 */
public class HW1Task2 {

    /**
     * The method checks is a number is positive.
     * @param maybePositive A number that may or may not be positive.
     * @return returns true if the method is positive and
     * false otherwise.
     */
    public static boolean isPositive(int maybePositive){
        return maybePositive >=0;
    }

    /**
     * Finds the number of digits in the proffered positive number.
     * @param num a positive number.
     * @return the number of digits in num. If num is non positive, then the
     * method should return -1.
     */
    public static int numDigits(int num){
       if (isPositive(num)){
           int count = 0;
           if (num == 0) {
               return 1;
           }
           while (num != 0) {
               num /= 10;
               count++;
           }
           return count;
       }
       return -1;
    }

    /**
     * Finds the requested digit of an integer, where digits are ordered from
     * right to left.
     * @param index The index of the desired digit.
     * @param num The number that the digit is to be taken from.
     * @return The digit at the requested index.  For example
     * given n = 5,678, if n = 0 then the method should return 8.  If n = 1
     * then the method should return 7, if n =5 the method should return 0.
     */
    public static int digitI(int index, int num){
        if (isPositive(num)){
            String numStr = Integer.toString(num); // המרת המספר למחרוזת
            int length = numStr.length(); // אורך המחרוזת
            int digitIndex = length - index - 1; // חישוב האינדקס של הספרה במספר החיובי
            if (digitIndex < 0 || digitIndex >= length) { // בדיקה אם האינדקס תקין
                return -1;
            }
            char digitChar = numStr.charAt(digitIndex); // קבלת התו המתאים לפי האינדקס
            int digit = Character.getNumericValue(digitChar); // המרת התו למספר
            return digit;
        }
        return -1;
    }

    /**
     * Flips the order of the digits of a positive number.
     * @param needsFlipping a number that needs to have the order of its digits
     * flipped.
     * @return A number whose digits are reversed in order from needsFlipping.
     * If needsFlipping is non positive, then the method returns -1.
     */
    public static int flipDigits(int needsFlipping){
        if (isPositive(needsFlipping)) {
            while(needsFlipping != 0)
            {
                int remainder = needsFlipping % 10;
                needsFlipping = needsFlipping * 10 + remainder;
                needsFlipping = needsFlipping/10;
            }
            return needsFlipping;
        }
        return -1;
    }

    /**
     * Tests the methods in the class.
     * @param args This parameter is never used.
     */
    public static void main(String[] args) {

        System.out.println(!isPositive(-4));
        System.out.println(isPositive(12));

        System.out.println(numDigits(123) == 3);

        System.out.println(digitI(2, 1234567) == 5);

        System.out.println(flipDigits(125) == 521);
        System.out.println(flipDigits(-7) == -1);
    }

}
