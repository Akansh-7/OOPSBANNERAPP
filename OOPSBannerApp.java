public class OOPSBannerApp {

    public static void main(String[] args) {

        // Banner lines assembled using helper methods
        String[] bannerLines = {
            getOPattern(0) + "  " + getOPattern(0) + "  " + getPPattern(0) + "  " + getSPattern(0),
            getOPattern(1) + "  " + getOPattern(1) + "  " + getPPattern(1) + "  " + getSPattern(1),
            getOPattern(2) + "  " + getOPattern(2) + "  " + getPPattern(2) + "  " + getSPattern(2),
            getOPattern(3) + "  " + getOPattern(3) + "  " + getPPattern(3) + "  " + getSPattern(3),
            getOPattern(4) + "  " + getOPattern(4) + "  " + getPPattern(4) + "  " + getSPattern(4),
            getOPattern(5) + "  " + getOPattern(5) + "  " + getPPattern(5) + "  " + getSPattern(5),
            getOPattern(6) + "  " + getOPattern(6) + "  " + getPPattern(6) + "  " + getSPattern(6)
        };

        // Loop-based rendering
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // ===== Helper Methods =====

    // O Pattern (7 lines, 9 characters wide)
    private static String getOPattern(int line) {
        switch (line) {
            case 0:
            case 6:
                return String.join("", " ", "*", "*", "*", "*", "*", "*", "*", " ");
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return String.join("", "*", " ", " ", " ", " ", " ", " ", " ", "*");
            default:
                return "";
        }
    }

    // P Pattern (7 lines, 9 characters wide)
    private static String getPPattern(int line) {
        switch (line) {
            case 0:
            case 3:
                return String.join("", "*", "*", "*", "*", "*", "*", "*", " ", " ");
            case 1:
            case 2:
                return String.join("", "*", " ", " ", " ", " ", " ", " ", " ", "*");
            default:
                return String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ");
        }
    }

    // S Pattern (7 lines, 9 characters wide)
    private static String getSPattern(int line) {
        switch (line) {
            case 0:
            case 3:
            case 6:
                return String.join("", " ", "*", "*", "*", "*", "*", "*", "*", " ");
            case 1:
            case 2:
                return String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ");
            case 4:
            case 5:
                return String.join("", " ", " ", " ", " ", " ", " ", " ", " ", "*");
            default:
                return "";
        }
    }
}