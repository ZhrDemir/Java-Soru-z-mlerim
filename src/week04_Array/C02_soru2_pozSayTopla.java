package week04_Array;

public class C02_soru2_pozSayTopla {
    public static void main(String[] args) {

        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        // method yaziniz.


        int [] arr = {1,-2,3,4,9,-8,9};
        System.out.println("Pozitif sayıların toplamı= "+ pozTopla(arr));
    }

    public static int  pozTopla(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0) {
                toplam += arr[i];
            }
        }return toplam;
    }

}
