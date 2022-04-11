package nisan10;

public class MethodArray {
    public static void main(String[] args) {
        int[] dizi = new int[]{4, 8, 2, 5, 7};
        diziyaz(dizi);

        int toplam = diziyiYolla(dizi);
        System.out.println();
        System.out.println(toplam);

        int sayi = degiskenleriTopla(4, 5);
        System.out.println(sayi);

        double dbl = degiskenleriTopla(3.14, 3.45, 75);
        System.out.println(dbl);

        String str = degiskenleriTopla("merhaba", "meryem");
        System.out.println(str);
    }













    private static String degiskenleriTopla(String merhaba, String meryem) {
        return merhaba + " " + meryem;
    }

    private static double degiskenleriTopla(double v, double i, int i1) {
        return v + i + i1;
    }

    private static int degiskenleriTopla(int i, int i1) {
        return i + i1;
    }

    private static int diziyiYolla(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        return toplam;
    }

    private static void diziyaz(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.printf("%d ", dizi[i]);
        }
    }
}
