public class ArrayOfDigits {
    public static int[] toArrayOfDigits(int n) {
        String temp = Integer.toString(Math.abs(n));
        int[] result = new int[temp.length()];
        int k = 0;
        for (int i = temp.length() - 1; i >= 0; i--) {
            result[k] = temp.charAt(i) - '0';
            k++;
        }
        return result;
    }
}
