package Algorithm_Datastructe.String;

public class Palindrome {

    public boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder();

        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        if (str.equals(rev.toString())) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        if (p.isPalindrome("IOI")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
