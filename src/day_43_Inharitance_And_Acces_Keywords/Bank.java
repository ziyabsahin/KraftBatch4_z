package day_43_Inharitance_And_Acces_Keywords;

public class Bank {
    public static String bakaAdi="Ciftlik";
    private int musteriSayisi;
    private int calisanSayisi;
    private double faizOrani;

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

    public double getFaizOrani() {
        return faizOrani;
    }

    private void setFaizOrani(double faizOrani) {
        this.faizOrani = faizOrani;
    }
    public double faizHesapla(double money, int ay){
        return (money/100)*(faizOrani/12)*ay;
    }
}
