package week04_ArrayList_sf211;

import java.util.ArrayList;
import java.util.List;

public class C06_tamBolen {
    public static void main(String[] args) {

     //  Soru 6- Verilen pozitif bir tamsayiyi, tam bolebilen tum pozitif tamsayilari bir liste
     //  olarak bize donduren bir method olusturun

        int sayi = 15;
        System.out.println("Verilen pozitif tam sayı : " + sayi + "\n Bu sayıyı tam bölen pozitif tam sayılar : " + tamBolen(sayi));




    }

    private static List< Integer>  tamBolen(int sayi) {

        List<Integer> tamBol = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                tamBol.add(i);
            }
        }  return tamBol;

    }
}
