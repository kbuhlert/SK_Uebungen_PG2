package Bsp3_Verwaltungsstrafe;

public class Strafen {
    private String vorname;
    private String nachname;
    private String kennzeichen;
    private int strafnummer;
    private double strafe=0;
    private int anzahl=0;

    public Strafen(String vorname, String nachname, String kennzeichen)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kennzeichen = kennzeichen;
        this.strafnummer = 3;
        //this.strafe = 0;
        //this.anzahl = 0;
    }

    public void strafekosten(int geschwindigkeitsueberschreitung){
        if(geschwindigkeitsueberschreitung<=20)
        {
            strafe = strafe + 30;
            anzahl++;
        }else if(geschwindigkeitsueberschreitung<=30)
        {
            strafe = strafe + 50;
            anzahl++;
        }else if(geschwindigkeitsueberschreitung<=50)
        {
            strafe = strafe + 100;
            anzahl++;
        }else if(geschwindigkeitsueberschreitung<=100)
        {
            strafe = strafe + 500;
            anzahl++;
        }else
        {
            strafe = strafe + 1500;
            anzahl++;
        }
    }

    public void verbandskasten (boolean verbandskasten){
        if(verbandskasten == false){
            strafe = strafe + 25;
            anzahl++;
        }else {strafe = strafe;}
    }

    public void alkohol (double alkohol){
        if(alkohol<0.5)
        {
            strafe = strafe;
        }else if(alkohol>=0.5 && alkohol<=1.0)
        {
            strafe = strafe + 100;
            anzahl = anzahl+2;}
        else if(alkohol<=2.0)
        {
            strafe = strafe + 400;
            anzahl = anzahl+2;
        }else if(alkohol<=3.0)
        {
            strafe = strafe + 1000;
            anzahl = anzahl+2;
        }else{
            strafe = strafe + 5000;
            anzahl = anzahl+2;
        }
    }

    public void sonstiges (double extrastrafe){
        strafe = strafe + extrastrafe;
        anzahl++;
    }

    public double getStrafe() {
        switch (anzahl){
            case 1:
                strafe = strafe*0.7;
                break;
            case 2:
                strafe = strafe*0.8;
                break;
            case 3:
                strafe = strafe*0.9;
                break;
        }
        return strafe;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getStrafnummer() {
        return strafnummer;
    }

    public int getAnzahl() {
        return anzahl;
    }

}
