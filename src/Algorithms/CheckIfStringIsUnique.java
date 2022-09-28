package Algorithms;

import java.util.*;


public class CheckIfStringIsUnique {
    public static void main(String[] args) {
        String str = "  ";
    String [] splitStr = str.split("");
        Set<String> unique = new HashSet<>();

        for(String c : splitStr){
            unique.add(c);
        }

       boolean result = true;

    if(splitStr.length == unique.size()){
        result = true;
    }
        else{
            result = false;
    }

        System.out.println(result);
    }
}
