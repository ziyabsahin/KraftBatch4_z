package day_43_Inharitance_And_Acces_Keywords;

import java.util.Random;

import static java.lang.Math.random;

public class Sube extends Bank{
    private String musteriId;
    private String musteriAdi;
    private int musteriSayisi;
    private int calisanSayisi;
    private double musteriBakiye;

    public String getMusteriId() {
        return musteriId;
    }

    private void setMusteriId() {
        this.musteriId = musteriIdBelirle(musteriAdi);
    }

    @Override
    public int getMusteriSayisi() {
        return musteriSayisi;
    }


    private void setMusteriSayisi(int musteriSayisi) {
        this.musteriSayisi = musteriSayisi;
    }

    private int getCalisanSayisi() {
        return calisanSayisi;
    }

    private void setCalisanSayisi(int calisanSayisi) {
        this.calisanSayisi = calisanSayisi;
    }

    public double getMusteriBakiye() {
        return musteriBakiye;
    }

    private void setMusteriBakiye(double musteriBakiye) {
        this.musteriBakiye = musteriBakiye;
    }
    private double paraEkle(double money){
        return musteriBakiye+=money;
    }
    private double paraCikar(double money){
        return musteriBakiye-=money;
    }
    public void musteriBakiyeFaiz(int ay){
      musteriBakiye=faizHesapla(this.musteriBakiye,ay);
    }
    private String musteriIdBelirle(String name){
        Random random=new Random();
        return name.substring(0,2)+random.nextInt(1000,9999);

    }
}
