package week03_WhileSoruları;

import java.util.Scanner;

public class C_ornekSifre {
    public static void main(String[] args) {

        //Kullanıcıdan şifre isteyin,
        // aşa şartları sağlamayınca hatalları yazdırın
        // yeni şifre girmesini isteyin
        // geçerli şifre girince başarıyla kaydedildi yazdırın.
          // şifrenin ilk karakteri küük harf olmalı
        // son karakteri sayı olmallı.

        Scanner scanner= new Scanner(System.in);

        boolean sifreDoğruMU = false;
        char ilkHarf ;
        char sonHarf;
        String  sifre ="";

        while (!sifreDoğruMU){
            System.out.println("Lütfen şifre giriniz");
            sifre =scanner.nextLine();
            ilkHarf = sifre.charAt(0);
            sonHarf = sifre.charAt(sifre.length()-1);

            if (ilkHarf<'a' || ilkHarf>'z' ) {
                System.out.println("Şifrenin ilk karakteri küçük olmalı");

            }else if (sonHarf<'0' || sonHarf>'9'){
                System.out.println("Şifrenin son karakteri rakam olmalı");
            }else {
                System.out.println("Şifre başarı ile kaydedildi");
                sifreDoğruMU = true;
            }
        }

    }

}
