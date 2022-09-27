package Algorithms;

import java.util.List;

public class BigSumArray {
    public static long aVeryBigSum(List<Long> ar) {
        //You are required to calculate and print the sum of the elements in an array,
        // keeping in mind that some of those integers may be quite large.

        Long result = 0L;

        for(Long num : ar){
            result += num;
        }
        return result;
    }

}
