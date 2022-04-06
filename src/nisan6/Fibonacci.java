package nisan6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


    /*
    ilk iki elemani sira ile 0 ve 1 olan, N elemanli bir tamsayi dizisinin
    elemanlari kendilerinden onceki elemanin toplamidir.Bu diziyi ekrana yazdiriniz
          input=
          N
          numbers []=0
          numbers[1]=1;

          output
          numbers={0,1,1,2,3,5,8,13}

            */
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();

        int [] fibonacci=new int[N];
        fibonacci[0]=0;
        fibonacci[1]=1;
        System.out.print(fibonacci[0]);
        System.out.print(fibonacci[1]);
        for (int i=2; i < fibonacci.length; i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        for (int i=2; i < fibonacci.length; i++){
            System.out.print(fibonacci[i]+ " ");
        }
}
}