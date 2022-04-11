package nisan11;

public class Recursive {
    public static void main(String[] args) {
        /*
        java recursive faktöriyel hesaplama

         */


            int fakt=faktoriyeYinelemeli(5);
            System.out.println(fakt);
        }
        public static int faktoriyeYinelemeli(int sayi)
        {
            if(sayi==0 || sayi==1)
                return 1;
            return faktoriyeYinelemeli(sayi-1) * sayi;
        }
    }

