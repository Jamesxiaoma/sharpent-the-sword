package com.company.L1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Test");
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        int[] results =  twoSum(nums, target);
        System.out.println(results[0]);

    }

    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 时间复杂度：两层 for 循环，O（n²）
     *
     * 空间复杂度：O（1）
     *
     * @param nums 数组
     * @param target 给定值
     * @return 数组
     */
    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i< nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 时间复杂度：一层 for 循环，O（n）
     *
     * 空间复杂度：O（n）
     *
     * @param nums 数组
     * @param target 给定值
     * @return 数组
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i< nums.length;i++){
            int sub = target - nums[i];
            if(map.containsKey(sub)){
                return new int[]{i,map.get(sub)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
