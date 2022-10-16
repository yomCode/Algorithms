package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        /*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
        such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
        Notice that the solution set must not contain duplicate triplets.

        Example 1:
        Input: nums = [-1,0,1,2,-1,-4]
        Output: [[-1,-1,2],[-1,0,1]]
        Explanation:
        nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
        nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
        The distinct triplets are [-1,0,1] and [-1,-1,2].
        Notice that the order of the output and the order of the triplets does not matter.
        Example 2:
        Input: nums = [0,1,1]
        Output: []
        Explanation: The only possible triplet does not sum up to 0.
        Example 3:
        Input: nums = [0,0,0]
        Output: [[0,0,0]]
        Explanation: The only possible triplet sums up to 0.
        */

       Integer[] nums = {0,0,0};
        List<List<Integer>> listResult = new ArrayList<>();

       for(int i = 0; i<nums.length-1; i++){
           for(int j=i+1; j< nums.length-2; j++){
               int firstNum = nums[i];
               int secondNum = nums[j];
               int thirdNum = nums[j+1];

               if((firstNum + secondNum + thirdNum) == 0){

                   List<Integer> list = new ArrayList<>(Arrays.asList(firstNum, secondNum, thirdNum));
                   listResult.add(list);

               }
           }
       }
        System.out.println(listResult);

    }
}
