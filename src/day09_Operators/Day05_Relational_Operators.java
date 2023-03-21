package day09_Operators;

public record Day05_Relational_Operators() {
    public static void main(String[] args){
        boolean resault=(60<40);
        System.out.println("resault = " + resault);

        boolean resault2=(60>40);
        System.out.println("resault2 = " + resault2);


        boolean resault3=(60>=60);
        System.out.println("resault3 = " + resault2);


        int findexScore=1650;
        boolean isEligiForLoan=findexScore>=1500;

        System.out.println("isEligiForLoan = " + isEligiForLoan);

        boolean resault4= 100<200;
        System.out.println("resault4 = " + resault4);

        boolean resault5=300>500;
        System.out.println("resault5 = " + resault5);

        int score=50;
        boolean hasFaild=score<75;

        System.out.println("hasFaild = " + hasFaild);

        boolean resault6=45<=60;
        System.out.println("resault6 = " + resault6);

        int x=100;
        int y=200;
        boolean isEqule=x==y;
        System.out.println("isEqule = " + isEqule);

        boolean resault7="ihsan"=="ahmet";
        System.out.println("resault7 = " + resault7);

        boolean resault8='A'=='A';
        System.out.println("resault8 = " + resault8);
        boolean resault9="java"=="java";
        System.out.println("resault9 = " + resault9);

        boolean resault10= 100!=200;
        System.out.println("resault10 = " + resault10);

        boolean resault11= "java"!="java"; //kural Stringlerde eşitlik operatorleri kullanılmaz

    }
}
