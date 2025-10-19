public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Not found");
    }
}
