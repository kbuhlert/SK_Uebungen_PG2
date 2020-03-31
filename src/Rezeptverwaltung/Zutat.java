package Rezeptverwaltung;

public class Zutat {
    public String zutat;
    public Double menge;

    public Zutat(String welcheZutat, Double mengeZutat) {
        this.zutat = welcheZutat;
        this.menge = mengeZutat;
    }


    public void print() {
        System.out.println("Sie brauchen " + menge + " " + zutat);
    }
}

/*public void setZutat (String nurDieseZutat){
    if(nurDieseZutat.equals("Eier"||"Mehl"||"Zucker")){
        zutat=nurDieseZutat;
    }else{
        System.out.println("Diese Zutat wird nicht gebraucht, bitte Eier, Mehl oder Zucker wählen.");
    }
}*/
