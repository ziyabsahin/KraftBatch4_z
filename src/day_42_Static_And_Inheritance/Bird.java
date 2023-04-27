package day_42_Static_And_Inheritance;

public class Bird extends Animal{
    //extends kalıtım saglıyor, diğer clasın izin verdiği her seyi yeni clasa tasıyor
    //inheritance is a relationship and parent-child şeklinde
    //super class-sub class, parent-child, base-derived seklinde isimlendirilirler
    //keyword---extends
    //public olanlar inheritance olablir
    //constructor ve private inheritance olamaz
    //privatelara getter ve setter ile ulaşabiliriz
    //inheritance child class tek extends edebilirken, parent class bir çok classa extends edebilir
    //iç içe extends olabilir dede, baba, torun gibi
    //önce parent class constructors execute, sonra child class execute eder
    //child class extends edildiğinde parent classta bir parametre constructer edilmişse, child clastada ataması gerekli
    //super() parent classın demek, this() bu clasın demek
    //child clasta super() keywordu ile boş parent classın constructerı cagrılır
    //parent classın constructerı cagrılır super() seklinde, bir parametre varsa parantez içerisinde tanımlanır
    //tıpkı this() de oldugu gibi

    int kanatUzunlugu;
    String gagaRengi;



    public void fly() {
        System.out.println(name+ " ucuyor");
    }
}
