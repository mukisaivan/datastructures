package aARRAYS;

//FAMOUS QUESTION  "FIND THE MISSING NUMBER FROM THIS ARRAY"

public class gMissingNumber {
    public static void main(String[] args) {

        int[] numbers = { 2, 4, 1, 8, 6, 3, 7 };

        findMissing(numbers);
        System.out.println(findMissing(numbers));


    }
    
    public static int findMissing(int[] arr) {
        
        int n = arr.length +1;
        int sum = n * (n + 1) / 2;

        for (int i : arr) {

            sum = sum - i;
        }
        return sum;


    }
}
