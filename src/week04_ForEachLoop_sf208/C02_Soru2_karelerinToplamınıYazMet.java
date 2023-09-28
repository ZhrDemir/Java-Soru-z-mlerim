package week04_ForEachLoop_sf208;

public class C02_Soru2_karelerinToplamınıYazMet {
    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        // yazdiran bir method olusturun

        int [] arr = {1,3,3,4,2};

        karelerinToplaYazdir(arr);
    }

    public static void karelerinToplaYazdir(int [] arr) {

       int toplam = 0;

        for (Integer each : arr
             ) {
            toplam += each*each;
        }

        System.out.println("Karelerin toplamı = " + toplam);


    }
}
