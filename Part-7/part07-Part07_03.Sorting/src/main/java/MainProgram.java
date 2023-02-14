
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 1, -15, 1, 3, 7, 5};
        MainProgram.indexOfSmallest(numbers);
    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int finalIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                finalIndex = i;
            }
        }
        System.out.println(finalIndex);
        return finalIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[min]) {
                min = i;
            }
        }      
        return min;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, smallestIndex, i);
            System.out.println(Arrays.toString(array));
        }
    }

}
