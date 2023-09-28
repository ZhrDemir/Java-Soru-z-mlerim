package calismalarim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_ArrayListTekrarıSil {
    public static void main(String[] args) {

        // Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        // elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.

        int[] arr = {2, 3, 4, 3, 2, 3, 4, 5, 6, 7, 8, 7, 6}; // verilen Array

        System.out.println("Verilen Array : " + Arrays.toString(arr));
        System.out.println("Tekrarsız Array : " + uniqe(arr)); // method un çağrılıp yazdırıldığı yer


    }

    private static List<Integer> uniqe(int[] arr) { // method

        List<Integer> uniqeList = new ArrayList<>();// Array ı Array list e çeviriyoruz

        Arrays.sort(arr); // sıralama yaptırıyoruz

        for (int i = 0; i < arr.length; i++) {

            if (!uniqeList.contains(arr[i])) {
                uniqeList.add(arr[i]);
            }

        }
        return uniqeList;
    }


}
