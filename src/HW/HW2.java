package HW;

public class HW2 {

    public static void main(String[] args) {
        System.out.println(ilkharfleriSonaEkle("merhaba", 4));
        System.out.println(benzersizHarf("amerhabam"));


    }





    public static String ilkharfleriSonaEkle(String str, int x){
    String result="";
    if(str.length()>=x){
        result=str.concat(str.substring(0,x));
    } else{
        result=null;
    }
    return result;
    }
    public static String benzersizHarf(String str){
        String result;
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                result=str.substring(i,i+1);
                return result;
            }



        }
        result="farklı harf yok";
        return result;



    }
}






