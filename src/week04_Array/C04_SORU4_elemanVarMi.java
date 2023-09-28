package week04_Array;

import java.util.Scanner;

public class C04_SORU4_elemanVarMi {

    public static void main(String[] args) {

        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi elemanı arıyorsunuz?");
        int hangisi = scanner.nextInt();

        kacKereVar(hangisi);

    }

    public static void kacKereVar(int hangisi) {
        int [] arr = {1,2,3,4};
        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == hangisi){
                sayac ++;
            }

        }if (sayac != 0 ){
            System.out.println("Aranan eleman " + sayac + " kere kullanılmıştır.");
        }else System.out.println("Aranan eleman bulunamamıştır.");
    }
}
