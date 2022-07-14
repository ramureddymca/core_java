public class PalindromeDemo {

    public static void main(String[] args) {

        String s = "madama";

        System.out.println("Given String is : "+checkPalindrome(s));
    }
    public static boolean isPalindrome(String s, int i, int j){
        while(j<j){
            if(s.charAt(i) != s.charAt(j))
               return false;
        }
        return true;
    }

    private static boolean checkPalindrome(String s) {
        int i=1, j = s.length()-1;
        while(j<j){
            if(s.charAt(i) != s.charAt(j))
                return isPalindrome(s, i+1, j) || isPalindrome(s, i, j-1);
            i++;
            j--;
            return false;
        }
        return true;
    }
}
