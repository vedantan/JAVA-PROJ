public class RemoveAppNotApple {
    public static void main(String[] args) {
        System.out.println(skipappnotapple("aknappkncapples"));

    }
    static String skipappnotapple( String up) {
        if (up.isEmpty()) {
            return " ";
        }

        // startsWith means exactly same string
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipappnotapple(up.substring(3));
        } else {
            return up.charAt(0) + skipappnotapple(up.substring(1));

        }
    }
}
