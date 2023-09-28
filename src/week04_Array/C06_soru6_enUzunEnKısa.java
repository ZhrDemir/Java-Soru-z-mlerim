package week04_Array;

public class C06_soru6_enUzunEnKısa {
    public static void main(String[] args) {

        // Verilen string bir array en uzun en kısa kelime yazdıran method

        String [] arr = {"Ayşe","Zehra","Zeynep","Ali"};
        enUzunEnKısa(arr);


    }

    public static void enUzunEnKısa(String [] arr){

        String enUzun = arr[0];
        String enKisa = arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i].length() < enKisa.length()){
                enKisa= arr[i];

            }
            if (arr[i].length()> enUzun.length()){
                enUzun = arr[i];

            }
        }
        System.out.println("Verilen Array de ki en kısa kelime: "+ enKisa);
        System.out.println("Verilen Array de ki en uzun kelime: "+ enUzun);
    }
}
