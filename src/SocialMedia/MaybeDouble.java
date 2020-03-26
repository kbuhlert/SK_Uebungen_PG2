package SocialMedia;

public class MaybeDouble {

    //nimmt boulesches Feld entgegen (Anzeigen oder nicht)

    private boolean showValue;
    private double value; //nimmt wert auf, der entsprechend showValue angezeigt wird

    public MaybeDouble(double value, boolean showValue) {
        this.showValue = showValue;
        this.value = value;
    }

    public String toString() {
        if(showValue){
            return "" + value;
        }else return "verborgen";
    }

    public boolean isShowValue() {
        return showValue;
    }

    public double getValue() {
        return value;
    }

    public void setShowValue(boolean showValue) {
        this.showValue = showValue;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
