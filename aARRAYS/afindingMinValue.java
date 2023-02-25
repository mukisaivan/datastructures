package aARRAYS;

public class afindingMinValue {
    public static void main(String[] args) {
        int[] numbers = { 5, 9, 3, 15, 1, 2 };

        findMin(numbers);

    }
    
    public static void findMin(int[] arr) {
        int min = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
