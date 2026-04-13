import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int [] prices = {19,8,3,4,5,1,7,20};
        MaxProfit maxProfit = new MaxProfit();
        System.out.println("Макс профит "+ maxProfit.maxProfit(prices));

        MaxProfitDays maxProfitDays = new MaxProfitDays();
        int [] resmax = maxProfitDays.maxProfit(prices);
        System.out.println("для профита " + resmax[0]
                + " нужно купить в день " + resmax[1]
                + " и продать в день " + resmax[2]);
        int[] array = {1, 4, 2, 8, 10};
        int target = 7;
        reverse(array);
        System.out.println("реверс ");
        for (int num : array) {
            System.out.print( num + " ");
        }
        //бинарное дерево - поиск числа
        int [] numbers = {1,3,5,7,9,11,13};
        int target2 = 11;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Бинарный поиск числа " + binarySearch(numbers, target2));

        int second = secondMax(array);
        System.out.println("Второй максимум " + second);
        int[] maxmin = findMaxAndMin(array);
        System.out.println("Max&Min" + Arrays.toString(maxmin));

        int[] res = findMaxAndIndex(array);
        System.out.println("Максимально число и его индекс" + Arrays.toString(res));

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

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
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

    public static int[] findMaxAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        int n = array.length;
        int max = array[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }

    public static int[] findMaxAndMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        int n = array.length;
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return new int[]{min, max};
    }

    public static int secondMax(int[] array) {
        int secondMax = Integer.MIN_VALUE;
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void reverse(int[] array) {
        int n = array.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            right--;
            left++;
        }

    }

    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int middle = left + (right-left)/2;
            if (numbers[middle]==target) {
                return middle;
            } else if (numbers[middle] > target) {
                right = middle -1;}
                else{left = middle + 1;}
            }
        return -1; // не найден
        }

}





