import java.util.Arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 0, 2, 4, 6, 8};
        System.out.println(binarySearch(arr, 7));//-1
        System.out.println(binarySearch(arr, 10));//-1
        System.out.println(binarySearch(arr, -4));//0
        System.out.println(binarySearch(arr, 6));//5

        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr, 6));
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if(arr[mid] < key)
                    low = mid + 1;
            else if (arr[mid] > key)
                    high = mid - 1;
        }
        return -low-1;
    }
}
