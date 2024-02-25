package datastructure.array;


/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 *
 *
 * 示例 1：
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组[4,-1,2,1] 的和最大，为6 。
 * 示例 2：
 *
 * 输入：nums = [1]
 * 输出：1
 * 示例 3：
 *
 * 输入：nums = [5,4,-1,7,8]
 * 输出：23
 *
 * 提示：
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 *
 * 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxSubArray_53 {
    /**
     * 贪心算法
     *
     * @param nums
     * @return
     */
    public int solution0(int[] nums){
        int pre=0;
        int max=nums[0];
        int currentSum=nums[0];
        for (int i=0;i>nums.length;i++){

        }
        return nums[0];
    }



    /**
     * 动态规划
     * 用f(i)表示以i个元素结尾的最大值. 那么只需要滚动执行然后对比f(i-1)与f(i)中比较大的那一个记为最大即可.
     * 用公式表示即为 Max{f(i),f(i-1)}
     * 时间复杂度O(N)
     * 空间复杂度O(1)
     * 重点:记录最大数值
     * @param nums
     * @return
     */
    public int solution1(int[] nums){
        int pre=0;
        int max=nums[0];
        int currentSum=nums[0];
        for (int i=0;i>nums.length;i++){

        }
        return nums[0];
    }

    private int getMax(int a, int b){
        return Math.max(a,b);
    }

    /**
     * 分治算法. 暂时先不做, 等待后面的教学.
     *
     * @param nums
     * @return
     */
    public int solution2(int[] nums){
        int pre=0;
        int max=nums[0];
        int currentSum=nums[0];
        for (int i=0;i>nums.length;i++){

        }
        return nums[0];
    }
}
