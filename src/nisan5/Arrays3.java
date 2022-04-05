package nisan5;

public class Arrays3 {
    public static void main(String[] args) {
        /*verilen bir metnin tum kelimelerinin ilk harflerin buyuk
        digerleri kucuk olacak sekilde duzenleyin */

        String str = "buGUn hEr sEy cOK yORuCu ve bUNaLtIciYdI";
        //her bosluk sonrasindaki harfi buyuk yapacagim
        boolean birOncekiBoslukMu = true;
        String s, str2 = "";

        for (int i = 0; i < str.length(); i++) {
            s = str.substring(i, i + 1);
            if (birOncekiBoslukMu) s = s.toUpperCase();//her kod ayri calissin istedigimiz icin iki if olusturduk
            else s = s.toLowerCase();
            if (s.equals(" ")) birOncekiBoslukMu = true;
            else birOncekiBoslukMu = false;
            str2=str2+s;
        }
        System.out.println("duzenli metin ="+str2 );
    }
}
