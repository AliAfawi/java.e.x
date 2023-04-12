package HW1;

/**
 * This is assignment 1.  This document is submitted in compliance with the
 * instructions in the file hw1_2023 sami.docx
 * @author FirstName LastName TZ:1234567
 */
public class HW1Task1 {

    /**
     * This method prints each of the parameters passed in order.
     * @param a The first parameter printed.
     * @param b The second parameter printed.
     */
    public static void printAll(double a, double b){
        //Wite code here that prints a and b.
        //be sure to remove these comments in the method.

        System.out.printf("a= "+a+", b= "+b);
    }

    /**
     * Prints the sum of the parameters passed.
     * @param a The first of the three numbers summed.
     * @param b The second of the three numbers summed.
     */
    public static void sum(double a, double b){
        //Wite code here that prints the sum of a and b.
        //be sure to remove these comments in the method.
        System.out.println("\n"+(a+b));

    }

    /**
     * Prints the sum of the parameters, rounded up.
     * @param a The first of the three numbers summed.
     * @param b The second of the three numbers summed.
     */
    public static void sumRoundedUp(double a, double b){
        //Wite code here that prints the sum of a and b and rounds
        //that sum up.
        //be sure to remove these comments in the method.
        double sum = a + b; // Calculate the sum of a and b
        int roundedSum =(int) Math.ceil(sum); // Round up the sum
        System.out.println(roundedSum);
    }

    /**
     * Prints the average of the parameters passed.
     * @param a The first component of the average.
     * @param b The second component of the average.
     */
    public static void average(double a, double b){
        double avg = (a + b)/ 2;
        System.out.println(avg);
    }

    /**
     * Checks if the numbers are nearly equals, and prints true if they are and
     * false if they are not.  In order to print true, the difference between
     * the numbers should be less than or equal to 1e-10.
     * @param a the first of the numbers being checked.
     * @param b the second of the numbers being checked.
     */
    public static void nearlyEqual(double a, double b){
        double epsilon = 1e-10; // אפסילון
        if (Math.abs(a - b) < epsilon) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    /**
     * The sum of the integers typecast from the double parameters.
     * @param a The first number to be typecast to an integer and summed.
     * @param b The second number to be typecast to an integer ans summed.
     */
    public static void integerSum(double a, double b){
        int x = ((int)a);
        int y = ((int)b);
        int sum = x+y;
        System.out.println(sum);
    }

    /**
     * The main method can be used to run a simple test.  More exaustive tests
     * will be used in grading.
     * @param args This parameter is not used.
     */
    public static void main(String[] args) {
        double x = .5, y = 7.8;
        printAll(x, y);
        sum(x, y);
        sumRoundedUp(x, y);
        average(x, y);
        nearlyEqual(x, y);
        integerSum(x, y);
    }
}
