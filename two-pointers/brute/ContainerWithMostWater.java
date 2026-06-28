

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxWater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int water = Math.min(height[i], height[j]) * (j - i);
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ContainerWithMostWater sol = new ContainerWithMostWater();
        System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); 
    }
}
