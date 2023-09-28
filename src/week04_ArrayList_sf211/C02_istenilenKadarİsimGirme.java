package week04_ArrayList_sf211;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class C02_istenilenKadarİsimGirme {
    public static void main(String[] args) {


      // Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
      // liste olarak dondurecek bir method olusturun.



        System.out.print("Girdiğiniz isimler: " + isimListesi());


    }

    private static String isimListesi() {
        Scanner scanner = new Scanner(System.in);
        List<String > nameList = new ArrayList<>();

        String isim ;
        do {

            System.out.println("Lütfen isim giriniz \n Q' ya basarak işlemi sonlandırabilirsiniz.");
            isim = scanner.nextLine();
            if (!(isim.equalsIgnoreCase("q"))) {

                nameList.add(isim);
            }
        }while (!(isim.equalsIgnoreCase("q")));
return nameList.toString();

    }
}
