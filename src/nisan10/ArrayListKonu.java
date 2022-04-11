package nisan10;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListKonu {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(3,43,43,32));
        System.out.println("list boyutu = "+list.size());//listin boyutunu soyle
        list.add(42);//diziye 42 ekle
        list.add(2,100);//2. indekse 100 ekle
        list.set(3,222);//3. indeksi 222 ile degistir ama eski degeri de sakla
        list.remove(5);//5. indeksi sil
        System.out.println("list i  goruntule = "+list);
        int toplam=list.get(3)+list.get(4);//3. ve 4. indexteki sayilari topla
        System.out.println("toplam = "+toplam);
        System.out.println("list + "+list);
//listin boyutu degistirilebilir, ekleme cikarma yapilarbilir ve
        //dizilere gore cok daha kullanislidir

    }
}
