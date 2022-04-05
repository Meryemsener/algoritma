package nisan5;

public class Arrays3 {
    public static void main(String[] args) {
        /*verilen bir metnin tum kelimelerinin ilk harflerin buyuk
        digerleri kucuk olacak sekilde duzenleyin */

        String str = "bugun her sey cok yorucu ve bunalticiydi";
        //her bosluk sonrasindaki harfi buyuk yapacagim
        boolean birOncekiBoslukMu = true;
        String s, str2 = "";

        for (int i = 0; i < str.length(); i++) {
            s = str.substring(i, i + 1);
            if (birOncekiBoslukMu) s = s.toUpperCase();
            else s = s.toLowerCase();
            if (s.equals(" ")) birOncekiBoslukMu = true;
            else birOncekiBoslukMu = false;
            str2=str2+s;
        }
        System.out.println("duzenli metin ="+str2 );
    }
}
