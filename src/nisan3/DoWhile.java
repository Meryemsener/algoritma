package nisan3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        for (int i = 0; i < 5; i++) {
            sayi = sc.nextInt();
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);
        //do while ile cozumu
        do{
            sayi = sc.nextInt();
            toplam = toplam + sayi;
        }while(sayi>0);
        System.out.println("toplam = "+toplam);
    }
}
