public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "I love Java programming";
        String[] words = sentence.split(" ");
        String oldWord = "Java", newWord = "Python";

        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.equals(oldWord))
                sb.append(newWord).append(" ");
            else
                sb.append(w).append(" ");
        }
        System.out.println("After replace: " + sb.toString().trim());
    }
}
