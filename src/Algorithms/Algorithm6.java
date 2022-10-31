package Algorithms;


//import java.util.Set;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.max;

public class Algorithm6 {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(24, 85, 0));
//
//        String[] firstEle = integers.get(0).toString().split("");
//        String[] secondEle = integers.get(1).toString().split("");
//        String[] thirdEle = integers.get(2).toString().split("");
//
//        ArrayList<String> arr = new ArrayList<>();
//
//        String firstBinary = "";
//        String secondBinary = "";
//        String thirdBinary = "";
//
//        arr.add(firstBinary);
//        arr.add(secondBinary);
//        arr.add(thirdBinary);
//
//        for(int i = 0; i< firstEle.length; i++){
//            firstBinary += firstEle[i];
//        }
//
//        for(int i = 0; i< secondEle.length; i++){
//            secondBinary += secondEle[i];
//        }
//
//        for(int i = 0; i< thirdEle.length; i++){
//            thirdBinary += thirdEle[i];
//        }
//
//        String combBinary = "";
//        for(int i = 0; i< arr.size(); i++){
//            combBinary += arr.get(i);
//        }
//
//        Integer arrToNum = Integer.valueOf(combBinary);
//
//        String finalNum = "";
//
//        while((arrToNum % 10) != 0){
//            Integer rem = arrToNum % 10;
//            finalNum += rem.toString();
//
//            arrToNum = arrToNum / 10;
//        }
//
//        System.out.println(Integer.parseInt(finalNum));

//        HashMap<String, String> newMap = new HashMap<>();
//
//        newMap.put("1", "Precious");
//        newMap.put("2", "Okiki");
//        newMap.put("3", "Yome");
//        newMap.put("4", "Ibrahim");
//        newMap.put("5", "Okiki");

//        for(int i =0; i< newMap.size(); i++){
//            System.out.println(newMap.get(i));;
//        }
//        for(Map.Entry<String, String> x : newMap.entrySet()){
//            System.out.println(x);
//        }
//
//        Set<String> set = new HashSet<>();
//
//        newMap = newMap.entrySet()
//                .stream()
//                .filter(entry -> set.add(entry.getValue()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

//        Collection<String> list = newMap.values();
//
//        for(Iterator<String> itr = list.iterator(); itr.hasNext();){
//            if(Collections.frequency(list, itr.next()) > 1){
//                itr.remove();
//            }
//        }
//
//        System.out.println(newMap);

//       List<Integer> array = Arrays.asList(1,8,6,2,4);
//        ArrayList<List<Integer>> result = new ArrayList<>();
//
//        ArrayList<Integer> res = new ArrayList<>();
//
//        for(int i = 0; i< array.size()-1; i++){
//
//            for(int j = 1; j< array.size(); j++){
//                List<Integer> arr = new ArrayList<>();
//                if(i != j){
//                    arr.add(array.get(j));
//                }
//
//                result.add(arr);
//            }
//        }
//
//        for(int i = 0; i< result.size(); i++){
//            for(int j = 0; j< result.get(i).size(); j++){
//                Integer x = 1;
//
//                res.add(x *= result.get(i).get(j));
//
//            }
//        }
//
//        System.out.println(res);

       /* ============================================================================



//===================================================================================================================
       /* Given an array nums of integers, return how many of them contain an even number of digits
       Example:
        Input: nums = [555,901,482,1771]
        Output: 1
        Explanation:
        Only 1771 contains an even number of digits.
        */

        int[] nums = {555,901,48234,1771};

        int count = 0;

        for(Integer num : nums){
            String[] numStr = String.valueOf(num).split("");
            int lengthCount = 0;
            for(int i = 0; i< numStr.length; i++){
                lengthCount++;
            }
            if(lengthCount % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

    }
}

