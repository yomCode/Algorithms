package Algorithms;


//import java.util.Set;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Algorithm6 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(24, 85, 0));

        String[] firstEle = integers.get(0).toString().split("");
        String[] secondEle = integers.get(1).toString().split("");
        String[] thirdEle = integers.get(2).toString().split("");

        ArrayList<String> arr = new ArrayList<>();

        String firstBinary = "";
        String secondBinary = "";
        String thirdBinary = "";

        arr.add(firstBinary);
        arr.add(secondBinary);
        arr.add(thirdBinary);

        for(int i = 0; i< firstEle.length; i++){
            firstBinary += firstEle[i];
        }

        for(int i = 0; i< secondEle.length; i++){
            secondBinary += secondEle[i];
        }

        for(int i = 0; i< thirdEle.length; i++){
            thirdBinary += thirdEle[i];
        }

        String combBinary = "";
        for(int i = 0; i< arr.size(); i++){
            combBinary += arr.get(i);
        }

        Integer arrToNum = Integer.valueOf(combBinary);

        String finalNum = "";

        while((arrToNum % 10) != 0){
            Integer rem = arrToNum % 10;
            finalNum += rem.toString();

            arrToNum = arrToNum / 10;
        }

        System.out.println(Integer.parseInt(finalNum));

    }
}

