package Algorithms;


//import java.util.Set;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Algorithm6 {
    public static void main(String[] args) {
//    String str = "abbcdefg";
//    String [] splitStr = str.split("");
//        Set<String> unique = new HashSet<>();
//
//        for(String c : splitStr){
//            unique.add(c);
//        }
//
//       boolean result = true;
//
//    if(splitStr.length == unique.size()){
//        result = true;
//    }
//        else{
//            result = false;
//    }
//
//        System.out.println(result);
//        int[] n = {1, 2, 2};
//        int sum = 0;
//        for (int i = 0; i < n.length; i++) {
//            int num = n[i];
//            sum += Math.pow(num, 2);
//        }
//        System.out.println(sum);

//        int amount = 290;
//
//        double hundreds = 0;
//        double fifties = 0;
//        double twenties = 0;
//
//        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 0, 0));
//
//        while(amount>= 40 && amount <= 1000){
//            hundreds = amount / 100;
//            arr.add((int)hundreds);
////                arr.get(0) = (int) hundreds;
//            amount = (amount % 100) ;
//
//
//            fifties =amount / 50.0;
//            arr.add((int)fifties);
//
//             amount = (amount % 50)*100;
//
//            twenties = amount / 20.0;
//            arr.add((int)twenties);
//
//
//        }
//
//
//        System.out.println(arr);

//        double amount = 350;
//        int numOf100s = 0;
//
//        int numOf100s = (int) (amount/100);
//        amount = amount - (numOf100s * 100);
//
//        int numOf50s = (int) (amount / 50);
//        amount = Math.abs(amount - (numOf50s *100));
//
//        int numOf20s = (int) (amount/20);
//
//        System.out.print(numOf100s + " ");
//        System.out.print(numOf50s + " ");
//        System.out.print(numOf20s);

//        while(true){
//
//
//        }

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(3);

        System.out.println(arr);
       Collections.sort(arr);
        System.out.println(arr);
        int[] newArr = {0,0};

        newArr[0] = arr.get(0);
        newArr[1] = arr.get(arr.size()-1);

        System.out.println(Arrays.toString(newArr));

    }
}

