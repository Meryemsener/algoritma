package nisan3;

public class ifElse {
    public static void main(String[] args) {
        int ali = 12;
        int ayse = 13;
        int hasan = 16;

        if (ali > ayse) {
            if (ali > hasan) {
                System.out.println("Ali en buyuktur");
            } else {
                System.out.println("hasan en buyuktur");
            }
        } else {
            if (ayse > hasan) {
                System.out.println("ayse en buyuktur");
            } else {
                System.out.println("hasan en buyuktur");
            }
        }
        //yukaridaki kod blogu ile asagidak kod blogu aynidir
        if (ali > ayse && ali > hasan) System.out.println("ali en buyuktur");
        if (ayse > ali && ayse > hasan) System.out.println("ayse en buyuktur");
        if (hasan > ali && hasan > ayse) System.out.println("hasan en buyuktur");

    }
}

