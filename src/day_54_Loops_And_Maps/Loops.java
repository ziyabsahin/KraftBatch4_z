package day_54_Loops_And_Maps;

import java.util.*;


public class Loops {
    //1-For each loop- daha önce araylerde görmüştük, aynısı.
    //arrayleri tek tek gezmemizi saglar. aynı şeyi for loop ile de yapabiliriz
    //sadece dataları gezeriz
    //setlerde for loop kullanamıyoruz ama foreachloop kullanbiliriz
    //2-Iterator, bir koleksiyonda gezinmek ve koleksiyondaki öğelere sıralı
    //erişim için collections framework tarafından sağlanan bir interface’dir
    //obje obje ilerliyor, gezici.
    //itaratorun kendi metodları var, next sonrakine gecmeyi yarar.hasNext ise sonraki var mı, remove var
    //forEach metodumuzda var ayrıca, bunu collectionlarda kullanıyoruz
    //Collection sort metodu var, listler için kullanıyoruz
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(35);
        list.add(5);
        list.add(10);
       // System.out.println(list);
//        for(Integer x:list){
//            System.out.println(x);
//        }


//        for (int i=0;i< list.size();i++){
//            if(list.get(i)<25){
//               list.remove(list.get(i));
//               i--;
//            }
//
//        }
//        System.out.println(list);

        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        set.add(15);
        set.add(25);
        set.add(35);
        set.add(5);
        set.add(10);
        for (Integer sayi:set) {
            if(sayi<25){
                continue;
            }
            set2.add(sayi);
        }
       // System.out.println(set2);
//        Iterator<Integer> itr= set.iterator();
//        while (itr.hasNext()){
//            Integer sayi= itr.next();
//            System.out.print(sayi+" ");
//            if(sayi<25){
//                itr.remove();
//            }
//        }
//        System.out.println(set);
        set.forEach(y-> System.out.println(y)); //forEach metod bu sekilde kullanılıyor,
        // tüm datayı ekrana yazdırmak için kullanabiliriz ya da dataları tek tek kullanacaksak işlem yapabiliriz



        System.out.println(Collections.max(list)); //collection sınıfının max, min ve copy metodları da var,
                                                   // ayrıca reverse metodu da var, tersten yazdırmaya yarar
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.print(list+" ");








    }
}
