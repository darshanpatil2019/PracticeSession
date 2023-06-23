import java.util.HashMap;
import java.util.Map;

public class FrequencyNumber {
    public static void main(String[] args) {

        int[] array = {10, 20, 10, 20, 30, 10, 3, 3, 10, 20, 3, 3, 300};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        System.out.println(map);
    }
}
