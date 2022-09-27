package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ScoresArray {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(4);
        a.add(1);
        a.add(3);

        b.add(3);
        b.add(2);
        b.add(3);

        List<Integer> result = new ArrayList<>();
        int player1 = 0;
        int player2 = 0;

        if(a.get(0) < b.get(0)){
             player2++;
        }else if(a.get(0) > b.get(0)){
             player1++;
        }else{
            System.out.println(0);
        }

        if(a.get(1) < b.get(1)){
            player2++;
        }else if(a.get(1) > b.get(1)){
            player1++;
        }else{
            System.out.println(0);
        }

        if(a.get(2) < b.get(2)){
            player2++;
        }else if(a.get(2) > b.get(2)){
            player1++;
        }else{
            System.out.println(0);
        }

        result.add(player1);
        result.add(player2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(result);


    }
}
