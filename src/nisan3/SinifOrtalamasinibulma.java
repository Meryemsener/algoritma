package nisan3;

import java.util.Scanner;

public class SinifOrtalamasinibulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mevcut=10;
        int toplam=0;
        double avarage;
        int not;
        for(int i=0; i<mevcut; i++) {
            not=scan.nextInt();
        }
        avarage=1.0*toplam/mevcut;
        System.out.println(avarage);
    }
}
