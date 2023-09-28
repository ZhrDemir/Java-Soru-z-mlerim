package week02_forLoop;

import java.util.Scanner;

public class C_soru9 {
    public static void main(String[] args) {

        // string iste tersten yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen terse çevirmek için bir metin girin");
        String metin = scanner.nextLine();


        String harf = "";
        for (int i= metin.length()-1; i>=0; i--){
            harf += metin.charAt(i);

        } System.out.println(harf);

        // tersi ile düzü aynı olan metinlere polindrome denir
        // girilen metnin polindrome olup olmadığını yazdır.

        if (metin.equalsIgnoreCase(harf)){
            System.out.println("girilen metin polinrome ");
        }else System.out.println("girilen metin polindrome değil");




}
}
