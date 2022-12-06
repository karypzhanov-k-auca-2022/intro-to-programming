public class Problem05 {

    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayTwo = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arrayThree = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int[] arrayFour = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        int[] arrayFive = {5, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1, 1};

        selectionSort(arrayOne);
        selectionSort(arrayTwo);
        selectionSort(arrayThree);
        selectionSort(arrayFour);
        selectionSort(arrayFive);

        printArray(arrayOne);
        printArray(arrayTwo);
        printArray(arrayThree);
        printArray(arrayFour);
        printArray(arrayFive);
    }

    public static void printArray(int[] a) {
        if (a.length > 0) {
            System.out.print(a[0]);
        }
        for (int i = 1; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {

            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}