package Algorithms;
import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(3);

        System.out.println("Array before sort: " + arr);
       Collections.sort(arr);
        System.out.println("Array after sort: " + arr);
        int[] newArr = {0, 0};

        newArr[0] = arr.get(0);
        newArr[1] = arr.get(arr.size()-1);

        System.out.println(Arrays.toString(newArr));
    }
}
