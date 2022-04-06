package nisan6;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        /*
        Bir siniftaki ogrencilerin boylari tam sayi olarak verilmistir, ayrica bu sinifin ogrencisi olan Ali'nin de
        boyu veriliyor,.Beden egitimi dersinde ogrenciler buyukten kucuge
        siralandiginda Ali kacinci sirada olur?(En uzun ogrenci 1. sirradadir ve boy esitligi dikkate alinmamistir°
        input={170,180,167,165,175,190,169,172,187,178,175}
        Alinin boyu 177
        output=Ali 5.siradadir

         */
        int [] boy = new int[]{170,180,167,165,175,190,169,172,187,178,175};
        int uzunlar=1;
        int aliBoy=175;
        for (int i =0;i<boy.length;i++){
            if (boy[i]>aliBoy) uzunlar++;
        }

        System.out.println("Ali "+uzunlar+". siradadir");

    }

}
