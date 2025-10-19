import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (seen.add(c))
                sb.append(c);
        }
        System.out.println("Without duplicates: " + sb.toString());
    }
}

