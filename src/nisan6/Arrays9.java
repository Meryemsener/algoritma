package nisan6;

public class Arrays9 {
    public static void main(String[] args) {
        /*
        Verilen metindeki sesli harfleri cikarip yerine sessizleri
        ekrana yazdiran programi yaziniz
        input= Merhaba hos geldiniz
        output= Mrhb hs gldnz
         */
        String str="Merhaba hos geldiniz";
        System.out.println(str);
        str=str.replace("a","");
        str=str.replace("e","");
        str=str.replace("i","");
        str=str.replace("u","");
        str=str.replace("o","");
        System.out.println(str);

        //ikinci yol
        String str2="";
        String sesliler="aeiou";
        for(int i=0; i<str.length(); i++){
            String s=str.substring(i, i+1);

        }
        System.out.println(str2);

    }
}
