package Collections;

import java.util.ArrayList;

public class NichtArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("Montag");
                arrayList.add("Dienstag");
                arrayList.add("Mittwoch");

        for (String day:arrayList){
            System.out.println(day);
        }

        for (int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
            if(arrayList.get(i).equals("Mittwoch")){
                arrayList.add(i+1,"Donnerstag");
                break;
            }
        }
        System.out.println("arrayList enthält 'Mittwoch' ist " + arrayList.contains("Mittwoch"));

        arrayList.remove("Dienstag");
        System.out.println(arrayList);

        arrayList.add(1, "Dienstag Neu");
        System.out.println(arrayList);
    }

}
