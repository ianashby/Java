public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // TEST 1
        System.out.println("==========================");
        System.out.println("Test 1");
        int target = 5;
        binarySearch(arr, target);
        System.out.println("==========================");

        // TEST 2
        System.out.println("Test 2");
        target = -1;
        binarySearch(arr, target);
        System.out.println("==========================");

        // TEST 3
        System.out.println("Test 3");
        target = 1;
        binarySearch(arr, target);
        System.out.println("==========================");

    }

    // This function performs a binary search on the given array. 
    // If the target is found, it returns the index of the target.
    // If the target is not found, it returns "not found".
    public static void binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println(target + " found at index " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(target + " not found");
    }
}
