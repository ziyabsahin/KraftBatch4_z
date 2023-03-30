package HW;

public class HW10 {
    public static void main(String[] args) {
        System.out.println(sayıKelime("merhaba"));
    }


    public static String sayıKelime(String str){
        String kelime="";
        int x=0;


        for (int i = 0; i < str.length(); i++) {


                x=str.length()-str.replace(str.substring(i,i+1),"").length();
                kelime=kelime+x+str.charAt(i);






        }
        return kelime;

    }
}
