package nisan5;

public class Arrays2 {
    public static void main(String[] args) {
        /*bir sinifa ait ders notlari verilmis,basarili ogrencilerin not ortalamalarini bulunuz
   50 ve yukari not alan ogrenciler basarili sayilmaktadir
   */
        int[] not = new int[]{49, 65, 78, 56, 34, 89, 90, 65, 100, 98};
        double sum = 0;
        int basariliSayisi = 0;
        double avarage;
        for (int i = 0; i < not.length; i++) {
            if (not[i] >= 50) {
                sum = sum + not[i];
                basariliSayisi++;
            }
        }
        avarage=1.0*sum/basariliSayisi;
        System.out.println(avarage);

    }
}
