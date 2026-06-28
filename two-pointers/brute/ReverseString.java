

public class ReverseString {

    public void reverseString(char[] s) {
        char[] temp = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            temp[i] = s[s.length - 1 - i];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        char[] arr = {'h','e','l','l','o'};
        sol.reverseString(arr);
        System.out.println(new String(arr)); 
    }
}
