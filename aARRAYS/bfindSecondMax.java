package aARRAYS;

//VIDEO 26 IN PLAYLIST

public class bfindSecondMax {
    public static void main(String[] args) {
        int[] numbers = { 13, 34, 2, 34, 33, 1 };

        findSmax(numbers);
      

    }

    private static void findSmax(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;  // this is done inorder to place the old max value to new max value in place of the secondMax
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
        


    }
}
