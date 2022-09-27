package Algorithms;

import java.util.*;
//import java.util.List;

public class PositiveNegativeZeroCount {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-1);
        arr.add(1);
        arr.add(-1);
        arr.add(0);
        arr.add(-1);

        float positiveNum = 0;
        float negativeNum = 0;
        float zeroNum = 0;

        for (int i =0; i < arr.size(); i++){
            if(arr.get(i) == Math.abs(arr.get(i)) && arr.get(i) != 0){
                positiveNum += 1;
            }else if(arr.get(i) == 0){
                zeroNum += 1;
            }else{
                negativeNum += 1;
            }
        }

        System.out.println(positiveNum / arr.size() + "\n" + negativeNum/ arr.size() + "\n" + zeroNum/arr.size());


//        System.out.println(positiveNum/ arr.size());
//        System.out.println(negativeNum);
//        System.out.println(zeroNum);

    }


}

