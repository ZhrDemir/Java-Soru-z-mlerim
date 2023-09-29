package calismalarim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C_girilenSayilaraKAsalSxxxxx {
    public static void main(String[] args) {

        //  Kullanıcı tarafından girilen sayıya kadar olan
        //  Asal Sayıları ekrana yazdıran bir kod yazınız


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz ; ");
        int sayi = scanner.nextInt();

        List<Integer> asalList = new ArrayList<>();

        for (int i = 2; i < sayi ; i++) {

            for (int j = 2; j <= i ; j++) {

                if ( i % j == 0){

            }


           }
        }


    }
}
