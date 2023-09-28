package week03_MethhodSoruları;

import java.util.Scanner;

public class C_soru1_sf142 {

    public static void main(String[] args) {

        // Kullanıcıdan input olarak verilen bir String, başlangıç ve bitiş indexlerine göre başlangıç indexi dahil,
        // bitiş indexi hariç olacak şekildeki aradaki harfleri yazdıran bir method oluşturun
        // -- kullnıcı başlangıç değeri olarak, bitiş değerinden büyük bir sayı girerse hata mesajı verin
        // --kullanıcı str'da olan index'lerden daha büyük bir index girerse hata mesajı verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin girin");
        String str = scanner.nextLine();
        System.out.println("Başlangıç indexi girin:");

         int baslangicIndex = scanner.nextInt();
        System.out.println("Bitiş indexi girin");
          int bitisIndex = scanner.nextInt();
          yazdirSubstring(str, baslangicIndex, bitisIndex);
    }
    public static void yazdirSubstring(String str, int baslangicIndex, int bitisIndex){

        if (baslangicIndex>=bitisIndex){
            System.out.println("Başlangıç indexi, bitiş indexinden büyük olamaz.");

        } else if (baslangicIndex<0 || bitisIndex> str.length()) {
            System.out.println("Geçersiz indexler");

        } else
            System.out.println(str.substring(baslangicIndex, bitisIndex));

    }
}
