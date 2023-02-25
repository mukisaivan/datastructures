package aARRAYS;

public class dreversingArray {
    public static void main(String[] args) {
        int[] numbers = { 8, 11, 5, 10, 7, 2 };

        reverse(numbers, 0, numbers.length-1);

        printArray(numbers);

    }

    public static void reverse(int[] arr, int start, int end) {
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];

            arr[end] = temp;

            start++;
            end--;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
