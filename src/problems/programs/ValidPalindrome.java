package problems.programs;

public class ValidPalindrome {
    public static void main(String[] args) {
        String string= "race a car";
        String s=string.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (s.charAt(i) != s.charAt(j)) {
                    System.out.println(false);
                    System.exit(1);
                }
                i++;
                j--;
            }
        }
        System.out.println(true);
    }
}
