package week04_ForEachLoop_sf208;

import java.util.ArrayList;
import java.util.List;

public class C01_Soru1_tekrarEdenleriSil {
    public static void main(String[] args) {

      //  Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
      //  elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin

        List<Integer> eskiList = new ArrayList<>();
        eskiList.add(1);
        eskiList.add(2);
        eskiList.add(3);
        eskiList.add(3);
        eskiList.add(4);
        eskiList.add(1);
        System.out.println("Verilen liste = "+ eskiList);

        List<Integer> yeniList = new ArrayList<>();

        for (Integer eleman:eskiList
             ) {
            if (!yeniList.contains(eleman)){
                yeniList.add(eleman);
                            }

        } eskiList = yeniList ;
        System.out.println(eskiList);
        for (Integer eleman :eskiList
             ) {
            System.out.print(eleman +" ");
        }




    }
}
