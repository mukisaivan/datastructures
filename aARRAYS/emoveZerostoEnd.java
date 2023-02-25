package aARRAYS;


// video 27


public class emoveZerostoEnd {


    public static void main(String[] args) {

        int[] numbers = { 8, 1, 0, 2, 1, 0, 3 };

        printArray(numbers);

        System.out.println(" ");

        moveZeros(numbers, numbers.length);

        printArray(numbers);
        

    }

    public static void moveZeros(int[] numbers, int n) {

        // making variable j so tht it can handle the zero and "i " to handle the non-zeros

        int j = 0;

        for (int i = 0; i < n; i++) {
            if (numbers[i] != 0 && numbers[j] == 0) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
            if (numbers[j] != 0) {
                j++;
            }
        }
        

    }
    
    public static  void printArray(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
