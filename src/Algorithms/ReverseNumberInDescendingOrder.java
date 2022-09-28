package Algorithms;

import java.util.Arrays;

public class ReverseNumberInDescendingOrder {
    public static void main(String[] args) {

        int n = 194732568;

        //Covert n to an string Array
        String[] arr = ("" + n).split("");
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        String newNumStr = "";
        for(int i = arr.length-1; i>=0; i--){
            newNumStr +=arr[i];
        }

        int reversedNum = Integer.parseInt(newNumStr);

        System.out.println(reversedNum);
    }
}
