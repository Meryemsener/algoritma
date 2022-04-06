package nisan6;

public class Arrays5 {
    public static void main(String[] args) {
        /*
        bir siniftaki ogrencilerin boylari tamsayi olarak sirasiz veriliyor,
        ayrica bu sinifin ogrencisi olan Ali'nin boyu veriliyor,Beden egitimi dersinde
        buyukten kucuge dogru ogrenciler siralandiginda Ali kacinci sirada olur(en uzun
        ogrenci 1. siradadir, Ali'nin boyu verilern dizide de yer almaktadir
         */
        int[]boylar=new int[]{190,170,167,182,190,145,165,176,158,178};
        int kacKisiAlidenUzun=0;
        int aliIleAyniBoydakiler=0;
        int ali=167;
        for (int i=0; i<boylar.length; i++) {
            if(boylar[i]==ali) aliIleAyniBoydakiler++;
            else if(boylar[i]>ali) kacKisiAlidenUzun++;
        }
        int siraOnceki=kacKisiAlidenUzun+1;
        int siraSonraki=kacKisiAlidenUzun+aliIleAyniBoydakiler;
        System.out.println("ali "+siraOnceki+ " ile "+siraSonraki+" arasinda bir yerdedir");

    }
}
