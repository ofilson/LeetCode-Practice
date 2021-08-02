import java.util.HashMap;
class Solution {
    public static void main(String[] args)
    {
        int[] nums = {3, 3};
        twoSum(nums, 6);
    }
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int check = target - nums[i];
            if (map.containsKey(check)) {
                System.out.println(i + ", " + map.get(check));
                return new int[] {i, map.get(check)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}