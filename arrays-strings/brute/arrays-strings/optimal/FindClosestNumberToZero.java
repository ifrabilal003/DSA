
public class FindClosestNumberToZero {

    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest)) {
                closest = num;
            } else if (Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        FindClosestNumberToZero sol = new FindClosestNumberToZero();
        int[] test1 = {-4, -2, 1, 4, 8};
        System.out.println(sol.findClosestNumber(test1)); 
        int[] test2 = {2, -1, 1};
        System.out.println(sol.findClosestNumber(test2)); // Output: 1
    }
}
