public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 12, -5, 16, 2, 12, 14, 10, 13, -3, 0, 9, 17, 11, -1};

        System.out.println("Original Array:");
        printArray(array);

        bubbleSort(array);

        System.out.println("\nSorted Array:");
        printArray(array);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}