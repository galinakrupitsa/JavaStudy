import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = {8, 4, 2, 3, 1};
        int target = 7;

        System.out.println(Arrays.toString(array));
        System.out.println("Метод пузырька");
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("нахождение суммы " + target);
        int[] result = findTwoIndices(array, target);
        if (result.length == 2) {
            System.out.println("Индексы чисел: " + Arrays.toString(result));
        } else {
            System.out.println("Пара не найдена.");
        }
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

    // Метод возвращает массив из двух индексов
    public static int[] findTwoIndices(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // хранит число -> индекс
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // возвращаем индексы
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // если пара не найдена
    }

}





