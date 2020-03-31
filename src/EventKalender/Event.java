package EventKalender;

public class Event {
    String title;
    String ort;
    double eintrittspreis;

    public Event(String title, String ort, double eintrittspreis) {
        this.title = title;
        this.ort = ort;
        this.eintrittspreis = eintrittspreis;
    }

    public String toString(){
        return "Event{" +
                "title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", price=" + eintrittspreis +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getOrt() {
        return ort;
    }

    public double getEintrittspreis() {
        return eintrittspreis;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setEintrittspreis(double eintrittspreis) {
        this.eintrittspreis = eintrittspreis;
    }
}
