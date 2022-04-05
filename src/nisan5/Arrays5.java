package nisan5;

public class Arrays5 {
    public static void main(String[] args) {
        //verilen bir tamsayi dizisinin en buyuk ve en kucuk elemanlarini bulup yer degistirn
        //input= {10,13,56,20,40,60,56,32}
        int[] sayi = new int[]{10, 13, 56, 20, 40, 60, 56, 32};

        int buyukEleman = sayi[0], sira = 0;
        for (int i = 0; i < sayi.length; i++) System.out.print(sayi[i] + " ");
        System.out.println();

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] > buyukEleman) {
                buyukEleman = sayi[i];
                sira = i;


            }
        }

        int kucukEleman = sayi[0], sira2 = 0;
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] < kucukEleman) {
                kucukEleman = sayi[i];
                sira2 = i;
            }
        }
        int temp = sayi[sira];
        sayi[sira] = sayi[sira2];
        sayi[sira2] = temp;

        for (int i = 0; i < sayi.length; i++) System.out.print(sayi[i] + " ");


    }
}