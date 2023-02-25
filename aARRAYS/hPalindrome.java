package aARRAYS;

// A PALINDROME IS A STRING THAT HAS THE SAME SPELLING WHEN SPELT BACKWARDS ie first char == last char

public class hPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));

    }
    
    public static boolean isPalindrome(String word) {
        
        char[] charArray = word.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }

            start++;
            end--;

        }
        return true;

    }
}
