package HW;

public class HW1 {
    public static void main(String[] args) {
        System.out.println(tekrarlananKarakterler("bugun hava degişik biraz"));

        System.out.println(unluUnsuzHarf("merhaban"));

        System.out.println(unluUnsuzHarf1("bugun hava yagmurlu"));
    }






    public static String tekrarlananKarakterler(String str){
        String result="";
        String result2="";
        for (int i = 0; i < str.length(); i++) {
            result2=str.substring(i+1);
            if(result2.contains(str.substring(i,i+1))){
                result+=str.substring(i,i+1);
            }


        }
        return result;



    }
    public static String unluUnsuzHarf(String str){
        String result="";
        String result2="";
        String result3="";
        for (int i=0; 0 < str.length(); ) {
            if (str.substring(i,i+1).equals("a")||str.substring(i,i+1).equals("e")||str.substring(i,i+1).equals("ı")||str.substring(i,i+1).equals("i")||
                    str.substring(i,i+1).equals("o")||str.substring(i,i+1).equals("ö")||str.substring(i,i+1).equals("u")|| str.substring(i,i+1).equals("ü")){
                result+=str.substring(i,i+1);
            } else{
                    result2+=str.substring(i,i+1);
            }
            str=str.replace(str.substring(i,i+1),"");

        }




        return result +" "+result2;
    }
    public static String unluUnsuzHarf1(String str){
        str=str.replace(" ","");
        String result="";
        String result2="";

        for (int i=0; 0 < str.length(); ) {
            switch (str.charAt(i)){
                case 'a','e','ı','i','o','ö','u','ü':
                    result+=str.charAt(i);
                    break;
                default:
                    result2+=str.charAt(i);
            }
            str=str.replace(str.substring(i,i+1),"");
            }
        return result +" "+result2;

        }






}
