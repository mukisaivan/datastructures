package aARRAYS;

public class fresizingArray {
    public static void main(String[] args) {

        //fresizingArray newFake = new fresizingArray();


        int[] numbers =  { 5, 9, 3, 10, 5};


        System.out.println(numbers.length);

        numbers = resize(numbers, 10);
        
        System.out.println(numbers.length);

    }

    public static int[] resize(int[] arr, int capacity) {

        int[] newArr = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;   
        
        return arr;

    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
