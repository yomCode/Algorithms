package Algorithms;

import java.util.ArrayList;
import java.util.Collections;

public class MaxOfConsecutiveOne {
    public static void main(String[] args) {
/*
        Given a binary array nums, return the maximum number of consecutive 1's in the array.
        Example
        Input: nums = [1,1,0,1,1,1]
        Output: 3
        Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
*/

        Integer[] nums = {1,1,0,1,1,1,1,0,1};
        int count = 0;
        int lengthCount =0;
        ArrayList<Integer> numList = new ArrayList<>();


        for (Integer num : nums) {

            if (num == 0) {
                numList.add(count);
                count =0;
                lengthCount++;
            }else if(lengthCount == nums.length-1){
                numList.add(count + 1);
            }else {
                count++;
                lengthCount++;
            }
        }

        Collections.sort(numList);
        System.out.println(numList.get(numList.size()-1));

    }
}
