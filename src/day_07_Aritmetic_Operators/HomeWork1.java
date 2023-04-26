package day_07_Aritmetic_Operators;

public class HomeWork1 {
    public static void main(String[] args){
        int toplam=31582;
        int sn=toplam%60;

        int dk=(toplam-sn)/60;
        int dk1=dk%60;
        int saat=toplam/3600;
        System.out.print(saat+":"+dk1+":"+sn);

    }
}
