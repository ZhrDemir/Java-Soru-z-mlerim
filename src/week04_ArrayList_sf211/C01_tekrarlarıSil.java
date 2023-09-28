package week04_ArrayList_sf211;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class C01_tekrarlarıSil {
    public static void main(String[] args) {

        // Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        // elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.


        int[] arr = {1, 3, 2, 3, 2, 4, 3, 5, 6, 7, 6};


        System.out.println("Unique List : " + yeniList(arr));

    }



    private static List<Integer>  yeniList(int arr[]) {

        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!liste.contains(arr[i])){
                liste.add(arr[i]);
            }
        }

return liste;
    }
}
