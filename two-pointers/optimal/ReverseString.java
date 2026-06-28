

public class ReverseString {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString sol = new ReverseString();
        char[] arr = {'h','e','l','l','o'};
        sol.reverseString(arr);
        System.out.println(new String(arr));
    }
}
