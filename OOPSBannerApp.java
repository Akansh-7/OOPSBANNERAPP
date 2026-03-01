public class OOPSBannerApp {

    public static void main(String[] args) {

        // Build the banner using helper methods at array declaration
        String[] bannerLines = {
            String.join("  ",
                    getOPattern()[0], getOPattern()[0], getPPattern()[0], getSPattern()[0]),
            String.join("  ",
                    getOPattern()[1], getOPattern()[1], getPPattern()[1], getSPattern()[1]),
            String.join("  ",
                    getOPattern()[2], getOPattern()[2], getPPattern()[2], getSPattern()[2]),
            String.join("  ",
                    getOPattern()[3], getOPattern()[3], getPPattern()[3], getSPattern()[3]),
            String.join("  ",
                    getOPattern()[4], getOPattern()[4], getPPattern()[4], getSPattern()[4]),
            String.join("  ",
                    getOPattern()[5], getOPattern()[5], getPPattern()[5], getSPattern()[5]),
            String.join("  ",
                    getOPattern()[6], getOPattern()[6], getPPattern()[6], getSPattern()[6])
        };

        // Render banner using enhanced for-loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    static String[] getOPattern() {
        return new String[] {
            "*********",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*********"
        };
    }

    // Helper method for letter P
    static String[] getPPattern() {
        return new String[] {
            "*********",
            "*       *",
            "*       *",
            "*********",
            "*        ",
            "*        ",
            "*        "
        };
    }

    // Helper method for letter S
    static String[] getSPattern() {
        return new String[] {
            "*********",
            "*        ",
            "*        ",
            "*********",
            "        *",
            "        *",
            "*********"
        };
    }
}