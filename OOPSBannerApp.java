public class OOPSBannerApp {

    public static void main(String[] args) {

        // Letter patterns stored as String arrays
        String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };

        String[] P = {
            "****** ",
            "*     *",
            "****** ",
            "*      ",
            "*      "
        };

        String[] S = {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };

        // Store letters in order: O O P S
        String[][] banner = { O, O, P, S };

        // Number of rows in each letter
        int rows = O.length;

        // Print banner using loops
        for (int i = 0; i < rows; i++) {
            for (String[] letter : banner) {
                System.out.print(letter[i] + "  ");
            }
            System.out.println();
        }
    }
}