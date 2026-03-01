public class OOPSBannerApp {

    public static void main(String[] args) {

        // Letter O
        String o1 = String.join("", " ***** ");
        String o2 = String.join("", "*     *");
        String o3 = String.join("", "*     *");
        String o4 = String.join("", "*     *");
        String o5 = String.join("", " ***** ");

        // Letter P
        String p1 = String.join("", "****** ");
        String p2 = String.join("", "*     *");
        String p3 = String.join("", "****** ");
        String p4 = String.join("", "*      ");
        String p5 = String.join("", "*      ");

        // Letter S
        String s1 = String.join("", " ***** ");
        String s2 = String.join("", "*      ");
        String s3 = String.join("", " ***** ");
        String s4 = String.join("", "      *");
        String s5 = String.join("", " ***** ");

        // Print OOPS banner line by line
        System.out.println(o1 + "  " + o1 + "  " + p1 + "  " + s1);
        System.out.println(o2 + "  " + o2 + "  " + p2 + "  " + s2);
        System.out.println(o3 + "  " + o3 + "  " + p3 + "  " + s3);
        System.out.println(o4 + "  " + o4 + "  " + p4 + "  " + s4);
        System.out.println(o5 + "  " + o5 + "  " + p5 + "  " + s5);
    }
}