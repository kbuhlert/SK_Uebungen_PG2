package UebVonFolien_Array;

public class Uebung1_Wochentage {
    public static void main(String[] args) {
        String[] monate = new String[]{"Januar","Februar","März","April","Mai","Juni","Juli","August"};

        for(int monatszahl=0; monatszahl<monate.length; monatszahl++){
            System.out.println(monate[monatszahl] + "[" + (monatszahl + 1) + "]");
        }
    }
}
