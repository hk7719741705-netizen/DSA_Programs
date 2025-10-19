import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        for (char c : freq.keySet())
            System.out.println(c + " -> " + freq.get(c));
    }
}

