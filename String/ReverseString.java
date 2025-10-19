public class ReverseString {
    public static void main(String[] args) {
        String str = "Harsh";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + rev);
    }
}
