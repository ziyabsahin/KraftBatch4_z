package day_16_Branching_Statements;

public class C03_Branching {
    public static void main(String[] args) {

        //break, continue ve return dallanma ifadeleridir
        //break içinde bulundugu loop u sonlandırıyor
        //continue loop u  başa döndürüp yeniden başlatıyor
        //return içinde bulundugu metodu sonlandırıyor



        int x=1;
        for (int i = 0; i < 10; i++) {
            x++; if (i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("program sonlandı");


    }
}
