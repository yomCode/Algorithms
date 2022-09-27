package Algorithms;

import java.util.ArrayList;

public class MinMaxSumFourElement {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            arr.add(5);
            arr.add(6);
            arr.add(7);

        int maxSum = 0;
        int minSum = 0;

        for(int i = 0; i <= 3; i++){
            maxSum += arr.get(i);
        }

        for(int j = arr.size()-1; j>= arr.size()-4; j--){
            minSum += arr.get(j);
        }

        System.out.println("Max: " + maxSum + "  " + "Min: " + minSum);

    }
}
