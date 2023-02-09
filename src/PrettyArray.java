public class PrettyArray {
    public static boolean isArrayPretty(int[] array) {
        int counter = 0;
        if (array.length == 0) {
            return false;
        }
        for (int nice : array) {
            for (int value : array) {
                if (nice == value + 1 || nice == value - 1) {
                    counter++;
                    break;
                }
            }
        }
        if (counter == array.length) {
            return true;
        }
        return false;
    }
}
