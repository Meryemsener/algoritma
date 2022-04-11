package nisan11;

public class WhileTOFor {
    public static void main(String[] args) {
        int toplam = 0;
        int i = 100;
        while (i >= 1)
        {
            toplam += i;
            i = i - 2;
        }
        System.out.println("toplam:"+toplam);

        //+++++++++++++
        int toplam1 = 0;
       // for (int i = 100; i >= 1; i = i - 2)
        toplam += i;
        System.out.println("toplam:"+toplam);

        for(int satir=0; satir<9; satir++)
        {
            for(int bosluk=0; bosluk<satir; bosluk++)
                System.out.print(" ");
            for(int yildiz=9; yildiz>satir; yildiz--)
                System.out.print("*");
            System.out.println();
        }
    }
}
