package Algorithms;

public class AddSumOfSquareArray {
    public static void main(String[] args) {
        int[] n = {1, 2, 3};
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            int num = n[i];
            sum += Math.pow(num, 2);
        }
        System.out.println(sum);
    }
}
