
class BinarySearchExample {

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;  // Element found
            }
            else if (arr[mid] < target) {
                start = mid + 1;  // Search right half
            }
            else {
               end = mid - 1; // Search left half
            }
        }

        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {2,5,8,12,16,23,38};
        int target = 16;

        int result = binarySearch(numbers, target);

        if (result != -1)
		{
            System.out.println("Element found at index: " + result);
		}
        else
		{
            System.out.println("Element not found");
		    System.out.println("Status:-1");
		}
    }
}