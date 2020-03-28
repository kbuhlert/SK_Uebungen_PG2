package SocialMedia;

public class Profil {

    private String userName;
    private String photoPath;
    private MayBe<Integer> alter;
    private String mobileNumber;
    private MaybeDouble weight; //Wir verwenden hir den selber kreierten Datentyp
    private Profil bestFriend;

    public Profil(String userName, String photoPath, int alter, String mobileNumber, double weight) {
        this.userName = userName;
        this.photoPath = photoPath;
        this.alter = new MayBe<Integer>(alter, false);
        this.mobileNumber = mobileNumber;
        this.weight = new MaybeDouble(weight, false);
    }

    public void setBestFriend(Profil bestFriend) {
        this.bestFriend = bestFriend;
    }


    public String getUserName() {
        return userName;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public int getAlter() {
        return alter.getValue();
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public double getWeight() {
        return weight.getValue();
    }

    public String toString() {          //Methode um Userinfos auszudrucken
        return "Profil{" +
                "userName='" + userName + '\'' +
                ", photoPath='" + photoPath + '\'' +
                ", alter=" + alter +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", weight=" + weight.toString() +
                ", bestFriend=" + bestFriend.userName +
                '}';
    }

    public void setWeightVisibility(boolean showWeight){
        weight.setShowValue(showWeight);
    }

    public void setAlterVisibility(boolean showAlter){
        alter.setShowValue(showAlter);
    }
}
