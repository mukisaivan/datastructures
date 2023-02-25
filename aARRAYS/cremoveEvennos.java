package aARRAYS;
public class cremoveEvennos {
    public static void main(String[] args) {

        int[] numbers = {3, 2, 4, 7, 6, 10, 5};

        Remove(numbers);

    }
    

    public static void Remove(int[] numbers) {
        
        

        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] result = new int[oddCount]; 
        int idx = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result[idx] = numbers[i];
                idx++;

                System.out.print(numbers[i]+ " ");
            }
        }
        

    }
}
