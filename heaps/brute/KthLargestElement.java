
import java.util.*;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        KthLargestElement sol = new KthLargestElement();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); 
    }
}
