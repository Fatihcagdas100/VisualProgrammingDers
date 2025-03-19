public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void selectionSort(int[] arr) {
        int smallest = arr[0];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }
            temp = arr[i];
            arr[i] = smallest;
            smallest = temp;
        }
    }
}
