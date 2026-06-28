
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int i = 0; // s ka pointer
        int j = 0; // t ka pointer

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // match mila, s aage badho
            }
            j++; // t hamesha aage badhta hai
        }
        return i == s.length(); // kya pura s mila?
    }

    public static void main(String[] args) {
        IsSubsequence sol = new IsSubsequence();
        System.out.println(sol.isSubsequence("abc", "ahbgdc")); 
        System.out.println(sol.isSubsequence("axc", "ahbgdc")); 
    }
}
