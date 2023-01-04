package datastructure.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * containsDuplicate
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3,1]
 * 输出：true
 * 示例 2：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：false
 * 示例 3：
 *
 * 输入：nums = [1,1,1,3,3,4,3,2,4,2]
 * 输出：true
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/contains-duplicate
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ContainsDuplicate {

    /**
     * 工程操作. 快,编写简单.
     * @param nums
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        long size = nums.length;
        long disctinctSize = Arrays.stream(nums).distinct().count();
        return size == disctinctSize ? false : true;
    }

    /**
     * 通过HashSet来实现,这样在时间复杂度上能达到1
     * @param nums
     * @return
     */
    public boolean containsDuplicateWithHashMap(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;

    }
}
