import java.util.Map;

public class HashMapUsage {
    public static int calculateSum(Map<String, Integer> data, String keyPart) {
        int result = 0;
        if (data.isEmpty()) {
            return result;
        }
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if ((entry.getKey().toLowerCase().split(keyPart, -1).length - 1) > 0) {
                result += entry.getValue();
            }
        }
        return result;
    }
}
