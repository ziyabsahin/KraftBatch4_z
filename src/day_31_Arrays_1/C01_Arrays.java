package day_31_Arrays_1;



public class C01_Arrays {


    public static void main(String[] args) {
        String[] y=new String[6];
        String z[]=new String[6];
        String t[];
        t=new String[6];
        //arrays aynı türden degişkenleri bir arada tutuyor
        //bastan kapasitesi belirlenir, kapasite aşılamaz, hata veriyor
        //bir class tır

        int x[]=new int[4];

        x[0]=1;
        x[1]=4;
        x[3]=9;
        System.out.println(x[2]);


        String str[]=new String[3];
        str[0]="merhaba";
        str[1]="nasılsın";
        str[2]="iyi misin";
        System.out.println(str[2]);


        String str2[]={"merhaba","nasılsın","iyi misin"};
        System.out.println(str2[1]);

        int num[]=new int[2];
        num[0]=10;
        num[1]=15;
        int sum=num[0]+num[1];

        System.out.println(sum);

        int num2[]={15,25};
        int sum2=num2[0]+num2[1];

        System.out.println(sum2);



    }






}
