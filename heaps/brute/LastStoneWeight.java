

import java.util.*;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) list.add(s);
        while (list.size() > 1) {
            Collections.sort(list);
            int n = list.size();
            int diff = list.get(n-1) - list.get(n-2);
            list.remove(n-1);
            list.remove(n-2);
            if (diff > 0) list.add(diff);
        }
        return list.isEmpty() ? 0 : list.get(0);
    }

    public static void main(String[] args) {
        LastStoneWeight sol = new LastStoneWeight();
        System.out.println(sol.lastStoneWeight(new int[]{2,7,4,1,8,1})); 
    }
}
