
public class SumOfArray {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(array);
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return sum;
    }
}
