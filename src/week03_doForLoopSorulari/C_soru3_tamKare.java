package week03_doForLoopSorulari;

import java.util.Scanner;

public class C_soru3_tamKare {
    public static void main(String[] args) {


        // Soru 3- Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
        //bulunuz, tamkare ise true değilse false yazdırınız.
        //Ornek : input : 16, output: 4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif sayı giriniz");
        int sayi = scanner.nextInt();
        int karekok = 1;
        do {
            if (karekok*karekok==sayi ) {
                System.out.println("Girdiğiniz sayı tamkare olduğu için true .Karekökü = " + karekok);


            }
            karekok++;

        }while (karekok*karekok<=sayi);
    }
}
