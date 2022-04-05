package nisan4;

import java.util.Scanner;

public class BoySorusu {
    public static void main(String[] args) {
        //Ali'nin boyu ve sinif arkadaslarinin boyu rastgele veriliyor,
        //ogrenciler boy sirasina dizildiginde ali kacinci sirada olur
        //alinin boyu siniftakilerinkinin icinde de var
        //ali=175, sinif boylari 175,185,165,175,182,173,182,175
        //
        Scanner scan = new Scanner(System.in);
        int mevcut=8;
        int ali=175;
        int alidenUzunlar=0;
        int aliIleAyniBoydakiler=0;
        int boy;
        for(int i=0; i<mevcut; i++){
            boy=scan.nextInt();
            if(boy==ali){
                aliIleAyniBoydakiler++;
            }else {
                if(boy>ali){
                    alidenUzunlar++;
                }
            }
        }

int ilkSira=alidenUzunlar+1;
        int sonSira=alidenUzunlar+aliIleAyniBoydakiler;
        System.out.println("Ali " +ilkSira+ " ile "+sonSira+" arasindadir");
    }
}
