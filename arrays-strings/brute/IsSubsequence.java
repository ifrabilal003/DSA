

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; j < t.length(); j++) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        IsSubsequence sol = new IsSubsequence();
        System.out.println(sol.isSubsequence("abc", "ahbgdc")); 
        System.out.println(sol.isSubsequence("axc", "ahbgdc")); 
    }
}
