package calismalarim;

public class C_arrayEnKEnB {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki en uzun ve
        // en kisa kelimeleri yazdiran bir method olusturun.

        String [] kelime = {"ayşe","veli","ali","sedat","semra","hümeyra"};

        enUenK(kelime);


    }

    private static void enUenK(String [] kelime) {

        String enKisa = kelime[0];
        String enUzun = kelime[0];



        for (int i = 0; i < kelime.length ; i++) {

                if (enKisa.length()>kelime[i].length()) {
                    enKisa = kelime[i];
                }
                if (enUzun.length()< kelime[i].length()){
                    enUzun = kelime[i];
                }


        }
        System.out.println("En kısa kelime : " + enKisa);
        System.out.println("En uzun kelime : " + enUzun);




    }
}
