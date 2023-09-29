package calismalarim;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class C_rasgeleEnB {
    public static void main(String[] args) {

        // 10 elemanlı bir tamsayı dizisine
        // 1 ile 100 arasında rastgele sayılar yerleştirildikten sonra
        // bu sayılardan en büyüğünü bulup yazdıran kodu yazınız

        int [] arr = new int[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {

            int rastSayi = random.nextInt(100);
            arr[i] = rastSayi;
        }
        System.out.println("10 elemanlı rastgele sayı dizisi : " + Arrays.toString(arr));


        int enB = 0;
        for (int i = 0; i <10 ; i++) {

            if (arr[i]>enB){
                enB=arr[i];
            }
        }

        System.out.println("Dizideki en büyük sayı : " + enB);




    }
}
