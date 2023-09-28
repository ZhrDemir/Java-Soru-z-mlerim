package week03_doForLoopSorulari;

import java.util.Scanner;

public class C_soru2_sifreCokİyi {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir

        Scanner scanner = new Scanner(System.in);
        String sifre = " ";


        do {
            System.out.println("Lütfen şifre girin: ");
            sifre = scanner.nextLine();

            if (sifre.length() < 8) {
                System.out.print("Hata! Şifre en az 8 karakter içermeli. ");
            } else {
                boolean kharf = false;
                boolean bharf = false;
                boolean ozelKrk = false;

                for (int i = 0; i <= sifre.length() - 1; i++) {
                    char krktr = sifre.charAt(i);

                    if (Character.isLowerCase(krktr)) {
                        kharf = true;
                    } else if (Character.isUpperCase(krktr)) {
                        bharf = true;

                    } else if (!(Character.isLetterOrDigit(krktr))) {

                        ozelKrk = true;

                    }if (kharf&&bharf&&ozelKrk){
                        System.out.println("Şifreniz kabul edilmiştir. Girdiğiniz şifre =  " + sifre);
                    return;
                    }

                }



             if (!kharf) {
                    System.out.print("Hata! Şifre küçük harf içermeli. ");

                } else if (!bharf) {
                    System.out.print("Hata! Şifre büyük harf içermeli. ");

                } else if (!ozelKrk) {
                    System.out.print("Hata! Şifre özel karakter içermeli. ");
                }


            }

        } while (true) ;



        }
    }
