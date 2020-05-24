package Bsp1_Arrays;

public class Bsp2_Arrays {

    public static boolean containsNumber(int[] numbers, int n){
        boolean contains = false;
        for (int i=0; i<numbers.length;i++){
            if (numbers[i]==n){
                contains = true;
                break;
            } else contains = false;
        }
        return contains;
    }

    public static int calculateSum (int[]numbers){
        int sum = 0;
        for(int i:numbers){
            sum+=i;
        }
        return sum;
    }

    public static int[] reverseArray (int[] original){
        int[] reverse = new int[original.length];
        for (int i=0; i<original.length;i++){
            reverse[i]=original[original.length-1-i];
        }
        return reverse;
    }


}
