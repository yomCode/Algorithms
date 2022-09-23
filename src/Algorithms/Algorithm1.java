package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithm1 {
    public static void main(String[] args) {

        //Given an array of integers, find the sum of its elements.
        // For example, if the array ar = [1, 2, 3], 1 +2 + 3 = 6 , so return 6.

        int[] arr = {1, 2, 3, 5, 6, 2, 6, 2};

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        List<Integer> result = new ArrayList<>();


        System.out.println(sum);

    }
}
