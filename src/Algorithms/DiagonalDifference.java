package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();
        Integer[] a = {1, 2, 9};
        Integer[] b = {4, 4, 6};
        Integer[] c = {7, 8, 9};

        arr.add(List.of(a));
        arr.add(List.of(b));
        arr.add(List.of(c));

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        for(int i =0; i< arr.size(); i++){
            firstDiagonalSum += arr.get(i).get(i);
        }

        for(int i = 0; i< arr.size(); i++){
            secondDiagonalSum += arr.get(i).get(arr.size() - (i + 1));
        }

        System.out.println(Math.abs(firstDiagonalSum - secondDiagonalSum));
    }
}
