

import java.util.*;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) i++;
            if (start == nums[i]) result.add("" + start);
            else result.add(start + "->" + nums[i]);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        SummaryRanges sol = new SummaryRanges();
        System.out.println(sol.summaryRanges(new int[]{0,1,2,4,5,7})); 
    }
}
