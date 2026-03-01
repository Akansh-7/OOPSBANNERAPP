/**
 * UC7 - Store Character Pattern in a Class
 * Demonstrates encapsulation of character banner patterns
 * using Inner Static Class and Object Array.
 */
public class OOPSBanner {

    /**
     * Inner Static Class to encapsulate a character
     * and its corresponding 7-line banner pattern.
     */
    public static class CharacterPattern {

        // Instance variables (Immutable after construction)
        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character The character represented
         * @param pattern   The 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the character
         *
         * @return character value
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the pattern of the character
         *
         * @return 7-line string array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Main method - assembles and prints OOPS banner
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Define patterns
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                "****** "
        });

        // Array of objects (O O P S)
        CharacterPattern[] banner = { O, O, P, S };

        // Print banner row by row
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : banner) {
                line.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}