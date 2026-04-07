import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, 2, 8, 1};

        System.out.println(Arrays.toString(array));
        bubbleSort(array);
    }
        public static void bubbleSort(int[] array){
        int n = array.length;
        boolean swapped = false;
        for (int i = 0; i <n-1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}



