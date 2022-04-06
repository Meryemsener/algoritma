package nisan6;

public class Arrays3 {
    public static void main(String[] args) {
        /*
        bir sinifa ait notlar veriliyor(1-100°,dersin hocasi en yuksek notu alan
        ogrencinin notunu 100'e tamamliyor ve bu ogrenciye ekledigi puan kadar
        tum ogrencilere puan ekliyor. Ogrencilerin ekleme sonrasi notlarini listeleyiniz

            notlar dizisi={70,80,90,65,75,90,69,72,87,90,75}
            output={80,90,100,75,85,100,79,82,97,100,85}

         */
        int[] notlar = new int[]{70, 80, 90, 65, 75, 90, 69, 72, 87, 90, 75};
        int enYuksekNot = 0;

        for (int i = 0; i < notlar.length; i++) {//en buyuk elemani bul
            if (notlar[i] > enYuksekNot) {
                enYuksekNot = notlar[i];

            }
        }

        int ek = 100 - enYuksekNot;

        for(int i=0;i<notlar.length;i++) {
            notlar[i] +=ek;
        }
        for(int i=0;i<notlar.length;i++){
            System.out.print(notlar[i] + " ");
        }
    }
}
