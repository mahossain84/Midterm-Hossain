package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String word1 = "MoM";
        String word2 = "DAD";
        String word3 = "MADAM";
        String word4 = "BROTHER";

        checkPalindrome(word1);
        checkPalindrome(word2);
        checkPalindrome(word3);
        checkPalindrome(word4);

    }

    private static void checkPalindrome(String word) {
        String pla = word.toUpperCase();
        String reverse = "";

        for (int i = pla.length() - 1; i >= 0; i--) {
            reverse = reverse + pla.charAt(i);


        }
        if(pla.equals(reverse)) {
            System.out.println("Yes it is a palindrome");
        } else{
            System.out.println("Not a palindrome");
        }


    }


}



