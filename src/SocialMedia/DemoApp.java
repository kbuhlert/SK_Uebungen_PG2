package SocialMedia;

public class DemoApp {
    public static void main(String[] args) {

        Profil susi = new Profil("susi@test.com", "test.com/susi.png", 38, "004366412345678",62.8 );

        Profil max = new Profil("max@gmx.net", "max.com/max.jpg", 42, "00436768822111", 70.5);

        Profil john = new Profil("john@john.net", "john.net/photo.png", 48, "0015511773311", 88.7);

        Profil helmut = new Profil("helmut@unigraz.at", "helmut.de/foto.jpg", 25, "06469550588", 87);

        Profil jakob = new Profil("jakob@kindergarten.at", "jakob.at/fotosvonmir.png",5, "nicht vorhanden", 22.5);

        susi.setBestFriend(max);
        max.setBestFriend(susi);
        john.setBestFriend(susi);
        helmut.setBestFriend(susi);
        jakob.setBestFriend(helmut);

        System.out.println("susi.toString() = " + susi.toString());
        System.out.println("max.toString() = " + max.toString());
        System.out.println("john.toString() = " + john.toString());
        System.out.println("helmut.toString() = " + helmut.toString());
        System.out.println("jakob.toString() = " + jakob.toString());

        System.out.println("------");
        System.out.println("Susi mit Gewicht und Alter auf sichtbar gesetzt: ");
        susi.setWeightVisibility(true);
        susi.setAlterVisibility(true);
        System.out.println(susi.toString());

    }

}
