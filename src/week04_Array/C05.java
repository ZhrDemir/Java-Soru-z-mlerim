package week04_Array;

import java.util.Arrays;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        // donduren bir method olusturun.


        String [] arrayOlsun = arrayOlustur();

        System.out.println(Arrays.toString(arrayOlsun));
    }

    public static String[] arrayOlustur() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array kaç elemanlı olsun?");
        int elemanSayisi = scanner.nextInt();
        String [] arr1 = new String[elemanSayisi];

        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("Array'ın elemanlarını isim olarak giriniz.");
            Scanner scanner1= new Scanner(System.in);
            String eleman = scanner1.nextLine();
            arr1[i] = eleman;
        }
        return arr1;


    }
}
