

import java.util.*;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        KthLargestElement sol = new KthLargestElement();
        System.out.println(sol.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}
