package SocialMedia;

//Unabhängig von Datentyp, ähnlich wie MaybeDouble

public class MayBe<T> {

    private boolean showValue; //true = zeigen, false = verbergen
    private T value; //nimmt wert auf, der entsprechend showValue angezeigt wird

    public MayBe (T value, boolean showValue) {
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

    public T getValue() {
        return value;
    }

    public void setShowValue(boolean showValue) {
        this.showValue = showValue;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
