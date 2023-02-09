public class CountOccurrences {
    public static int countOccurrences(String str, String substr) {
        return str.split(substr, -1).length - 1;
    }
}
