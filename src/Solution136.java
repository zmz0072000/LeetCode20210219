import java.util.ArrayList;
import java.util.List;

// 136: https://leetcode.com/problems/single-number/
// Runtime: 429 ms, faster than 8.47% of Java online submissions for Single Number.
// Memory Usage: 40.8 MB, less than 18.56% of Java online submissions for Single Number.

public class Solution136 {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums){
            if (!list.remove(Integer.valueOf(num))){
                list.add(Integer.valueOf(num));
            }
        }
        return list.get(0);
    }
}
