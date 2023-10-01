package calismalarim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C_rastgeleSifreUretme {
    public static void main(String[] args) {

     //  Soru : Rastgele Şifre Üretici: Kullanıcının istediği uzunlukta rastgele
     //  şifreler üreten bir program yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Şifreniz kaç rakamdan oluşsun? ");
         int uzunluk= scanner.nextInt();

        Random random = new Random();
        int rastgeleSifre = 0;

        List<Integer> sifre = new ArrayList<>();

        for (int i = 0; i < uzunluk ; i++) {
            rastgeleSifre = random.nextInt(10);
            sifre.add(rastgeleSifre);

             }

        System.out.println("İstediğiniz uzunlukta rastgele şifreniz : " + sifre);



    }
}
