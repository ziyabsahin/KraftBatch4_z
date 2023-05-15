package day_55_Map;

import java.util.ArrayList;

public class Ogrenci {
    private String isim;
    private String soyİsim;
    private int no;
    public ArrayList<String> dersler=new ArrayList<>();

    public Ogrenci(String isim, String soyİsim, int no) {
        this.isim = isim;
        this.soyİsim = soyİsim;
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public String getSoyİsim() {
        return soyİsim;
    }

    public ArrayList<String> getDersler() {
        return dersler;
    }

    public int getNo() {
        return no;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyİsim(String soyİsim) {
        this.soyİsim = soyİsim;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyİsim='" + soyİsim + '\'' +
                ", no=" + no +
                ", dersler=" + dersler +
                '}';
    }

    public void setDers(ArrayList<String> dersler) {
        this.dersler = dersler;
    }
    public void ekleders(String ders){
        this.dersler.add(ders);
    }
}
