package day_38_Constructors;

public class C01_Summary {
    public static void main(String[] args) {



    }


    public static boolean isStrongPassword(String password){
       boolean r1=password.length()>=8&&!password.contains(" ");
       boolean r2=false;
       boolean r3=false;
       boolean r4=false;
       boolean r5=false;
       char[] chars=password.toCharArray();
        for (char c : chars) {
            if(Character.isUpperCase(c)){
                r2=true;
            } else if(Character.isLowerCase(c)){
                r3=true;
            } else if(Character.isDigit(c)){
                r4=true;
            } else{
                r5=true;
            }

        }

        return r1&&r2&&r3&&r4&&r5;

    }
}
