public class WordCount {
    public static void main(String[] args) {
        String sentence = "Java is powerful and fast";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}
