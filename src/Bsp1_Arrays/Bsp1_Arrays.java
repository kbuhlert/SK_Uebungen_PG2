package Bsp1_Arrays;

import java.util.Arrays;

public class Bsp1_Arrays {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,1,6,7};
        //Ausgabe 1a)
        printArray(array1);
        //Ausgabe 1b)
        System.out.println();
        System.out.println(containsNumber(array1, 1));
        //Ausgabe 1c)
        System.out.println(calculateSum(array1));
        //Ausgabe 1d)
        int[] umgekehrtesArray = reverseArray(array1);
        System.out.println(Arrays.toString(umgekehrtesArray));
        printArray(umgekehrtesArray);

    }
    //Methode 1a): Methode gibt Arrays mit "," getrennt aus
    public static void printArray (int[]array1){
        for (int element:array1) {
            System.out.print(element + ", ");
        }
    }
    //Methode 1b) Test ob Zahl im Array vorkommt
    public static boolean containsNumber (int[] numbers, int n){
        for(int element:numbers){
            if (element==n){
                return true;
            }}return false;
        }

    //Methode 1c) Summe der Elemente im Array
    public static int calculateSum(int[]array1){
        int summe = 0;
        for(int element:array1){
            summe = summe+element;
        }
        return summe;
    }
    //Methode 1d) neues Array erstellen und Zahlen in umgekerhter Reihenfolge einordnen
    public static int[] reverseArray(int[]array1){
        int[] reverse = new int[array1.length];
        for (int i=0; i<array1.length; i++){
            reverse[array1.length-1-i]=array1[i];
        }
        return reverse;
    }
}
