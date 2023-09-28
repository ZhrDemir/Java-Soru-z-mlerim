package week03_MethhodSoruları;

import java.util.Scanner;

public class C_soru2_İsimSoyi {

    public static void main(String[] args) {

        // kullanıcıdn main method içinde ayrı ayrı isim ve soyismini alın
        // isim ve soyismi ilk harfleri büyük diğer harfleri küçük olacak şekilde düzenleyip,
        // isim boşluk soyisim şeklinde bize döndüren bir method oluşturun
        // input: isim : Ali soyisim : YILMAZ      output : Ali Yılmaz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("İsim giriniz : ");
        String isim = scanner.nextLine();

        System.out.print("Soyisim giriniz : ");
        String soyisim = scanner.nextLine();
         isimSoyisim(isim,soyisim);

    }
    public static String isimSoyisim(String isim,String soyisim){
        String isim1 = isim.toUpperCase().charAt(0) +isim.substring(1).toLowerCase();
        String isim2 = soyisim.toUpperCase().charAt(0) + soyisim.substring(1).toLowerCase();

        System.out.print(isim1 + " " +isim2);

    return isim ;
    }
}
