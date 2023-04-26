package day_39_Constructors_Overloading;

import java.util.Random;

public class KraftBank {
    String costomerFullName;
    int costomerId, costomerAccont;
   String token;
    boolean isSms;

    public KraftBank(String costomerFullName,int costomerId, boolean isSms){
        this.costomerFullName=costomerFullName;
        this.costomerId=costomerId;
        this.isSms=isSms;
    }
    public KraftBank(String costomerFullName,int costomerId, boolean isSms,int costomerAccont, String token){
        this(costomerFullName,costomerId,isSms);
        this.costomerAccont=costomerAccont;
        this.token=token;
    }
    public KraftBank costomerAccontBelirleme(KraftBank kraftBank,int newCostomerAccont){
        costomerAccont=newCostomerAccont;
        return kraftBank;
    }
    public String tokenBelirleme(){
        Random random=new Random(1000);
        int x=random.nextInt(9999);

        token=costomerFullName.substring(0,2)+x;
        return token;

    }
    public double addMoney( double addMoney){
       return costomerAccont+=addMoney;

    }
    public String toString(){
        return "costomerFullName ="+costomerFullName+
                " costomerId ="+costomerId+
                " costomerAccont ="+costomerAccont+
                " isSms ="+isSms+
                " token ="+tokenBelirleme();

    }
}

