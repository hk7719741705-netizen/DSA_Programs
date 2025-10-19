import java.util.*;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "aabbcde";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeated: " + c);
                break;
            }
        }
    }
}

