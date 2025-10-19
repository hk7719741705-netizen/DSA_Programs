public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int max = 0;
        for (int n : arr) if (n > max) max = n;

        int[] count = new int[max + 1];
        for (int n : arr) count[n]++;

        System.out.print("Sorted: ");
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
    }
}
