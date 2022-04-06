package nisan6;

public class Arrays2 {
    public static void main(String[] args) {
        //bir dersten ogrencilerin aldigi notlar,tamsayi dizisi olarak veriliyor
        //en yuksek notu kac ogrenci almisitr
        //input={95,70,80,90,65,75,95,47,73,56,72,95}
        //output=3

        int[] notlar = new int[]{95, 70, 80, 90, 65, 75, 95, 47, 73, 56, 72, 95};
        int yuksekNotAlanSayisi=0;
        int buyukEleman = 0;


        for (int i = 0; i < notlar.length; i++) {//en buyuk elemani bul
            if (notlar[i] >buyukEleman) {
                buyukEleman = notlar[i];

            }

        }
        for (int i = 0; i <notlar.length;i++){//en buyuk elemani say
            if(notlar[i] ==buyukEleman) yuksekNotAlanSayisi++;
        }
        System.out.println("en yuksek notu alan kisi sayisi = " + yuksekNotAlanSayisi);
    }
}