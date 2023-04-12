
package HW1;

/**
 *
 * @author firstName lastName ID:1234567
 */
public class HW1Task4 {


    /**
     * Prints the proffered numbers as a number of notes or coins.  For example:
     * 1 Note(s) of 200.0
     * 0 Note(s) of 100.0
     * 1 Note(s) of 50.0
     * 0 Note(s) of 20.0
     * 0 Coin(s) of 10.0
     * 1 Coin(s) of 5.0
     * 1 Coin(s) of 2.0
     * 1 Coin(s) of 1.0
     *
     * @param twoHundred The number of 200 notes to be printed.
     * @param oneHundred The number of 100 notes to be printed.
     * @param fifty The number of 50 notes to be printed.
     * @param twenty The number of 2 notes to be printed.
     * @param ten The number of 10 noted to be printed.
     * @param five The number of 5 notes to be printed.
     *
     */
    public static void printNotes(int twoHundred, int oneHundred, int fifty, int twenty, int ten, int five){

    }

    /**
     * Prints the smallest assortment of coins and bills that add up to the
     * proffered sum.
     * @param money The sum of money that the coins and notes to be printed
     * adds up to.
     */
    public static void coinsAndNotes(int money){
        if (money < 100 || money > 1000)
            System.out.println("Error");

    }

    /**
     * Tests the coinsAndNotesMethod
     * @param args This parameter is never used.
     */
    public static void main(String[] args) {
        coinsAndNotes(258);
    }

}
