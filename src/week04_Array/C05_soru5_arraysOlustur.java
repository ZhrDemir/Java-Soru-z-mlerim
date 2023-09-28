package week04_Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C05_soru5_arraysOlustur {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        // donduren bir method olusturun.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Array kaç elemanlı olsun?");
        int elemanSayisi = scanner.nextInt();
        int[] arr1 = new int[elemanSayisi];
        System.out.println(Arrays.toString(arrayOlustur(arr1)));
    }

    private static int[] arrayOlustur(int[] arr1) {


        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("Array'ın elemanlarını giriniz.");
            Scanner scanner1= new Scanner(System.in);
            int eleman = scanner1.nextInt();
            arr1[i] = eleman;
        }
       return arr1;
    }
    }


