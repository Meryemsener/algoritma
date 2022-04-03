package nisan3;

public class ders3 {
    public static void main(String[] args) {


    int num1=12;
    int num2=18;
    int num3=20;
    int avarage=(num1+num2+num3)/3;
        System.out.println(avarage);

        String str="Merhaba dunya";
        int bosluk=str.indexOf(" ");//boslugugun indexini bul
        System.out.println("bosluk= "+ bosluk);//boslugun indexini yazdir
        String s1;
        String s2;
        String str2;
        s1=str.substring(0,bosluk);//0 dan basla bosluga kadar-bosluk haric- yazdir
        s2=str.substring(bosluk+1);//bosluktan bir sonraki indexten basla sonuna kadar yazdir
        //dunya merhaba yazdiriyoruz
        str2=s2+" "+s1;
        System.out.println(str2);//dunya Merhaba



    }
}
