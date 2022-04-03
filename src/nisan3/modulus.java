package nisan3;

public class modulus {
    public static void main(String[] args) {
        int a=12;
        int b=5;
        int kalan=a%b;//a nin b ye bolumunden kalan
        //int a%10 a nin 10 'a bolumunden kalan



        int c=43;
        int d=4;
        int birlerbasamagi=c%10;
        int onlarbasamagi=c/10;
        c=birlerbasamagi*10+onlarbasamagi;
        System.out.println("c = " + c);

        String str=String.valueOf(c);//integer veriyi sayiya cevirme
        System.out.println("str = " + str);
        str=str.substring(1,2)+str.substring(0,1);
        System.out.println("str = " + str);
        int sayi=Integer.valueOf(str);//integer sayiyi stringe cevirir
        int sayi1=Integer.parseInt(str);//integer sayiyi stringe cevirir

    }
}
