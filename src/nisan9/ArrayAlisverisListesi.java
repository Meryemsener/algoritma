package nisan9;

public class ArrayAlisverisListesi {
    public static void main(String[] args) {
        /*
        Bir alışveriş listesi hazırlıyoruz.
        Ve listede bir elemanı yanlış yazdığımızı fark ettik,
         düzeltip yerine başka bir eleman eklemek istiyoruz.
         Yani dizide bir elemanı silip yerine başka bir eleman
         ekleyeceğiz.
        Peki bunu Java’da nasıl oluşturacağız ?
         */
        /*
        Cozum yolu
        Kodlarımızı Array ile yazdık ve sorunsuz bir şekilde çalıştı. Şimdi de
        kodlarımızı ele alma vakti 🙂

İlk olarak oluşturacağımız listenin boyutunu Scanner komutu ile klavyeden giriyoruz.
“Alınacaklar” adını verdiğimiz String dizisini oluşturuyoruz.
           ArrayList <String> alinacaklar=new ArrayList<String>();

For döngüsü ile listemize n tane eleman ekliyoruz.
           alinacaklar.add(kalvye.nextInt();

Klavyeden elemanlarını girerek oluşturduğumuz diziyi bir sonraki adımda
daha net görebilmek amacıyla, bir for döngüsü daha oluşturarak dizinin
elemanlarını yazdırıyoruz.
          System.out.println(alinacaklar.get(j));

Değiştirmek istediğimiz elemanın indeks değerini klavyeden girerek
değerinin değişmesi için ilk adımı atmış olduk böylece.
        System.out.println(“Hangi Elemanı Değiştirmek İstiyorsunuz ?”)
                    int ara=klavye.nextInt();

Sildiğimiz değerin yerine başka bir değer eklenecek. Bu adımda da eklemek
istediğimiz değeri klavyeden atamış oluyoruz.
       System.out.println(“Listeye Hangi Malzemeyi Eklemek İstiyorsunuz ?”);
        String eleman=klavye.next();







NOT: Burada string ve int yapılarına dikkat etmek gerekebilir.
İnteger değerini indisi atamak, yani elemanın dizideki sırasını
 belirleyebilmek için kullandık. Ekleyeceğimiz eleman ise String yapıda olmalı.
 Çünkü diziyi tanımlarken String yapıda elemanlardan oluştuğunu belirtmiştik.
 Eğer buraya integer yapıda değer atarsak programımız hata verecektir.







Daha sonra elemanı silip, yerine ekleyeceğimiz değerin gelmesini
 sağlayan metodu yazıyoruz.

   alinacaklar.add(ara-1,eleman);





NOT: .add komutunu diziye elemen ekleyeceğimiz zaman kullanıyoruz.
 Parantezdeki değerlerimize de sırasıyla sileceğimiz değerin indisi ve
 eklenecek değeri yazıyoruz. Burada ara-1 şeklinde yazmamızın sebebi
 Java’da dizilerin 0. elemandan başlaması idi. “ara” olarak kalsaydı
 istediğimiz indis değerini değil, bir sonraki değeri silmiş olacaktı.







Son olarak da dizimizin son halini for döngüsü ile yazdıracağız.
            for(int k=0;k<alinacaklar.size();k++){                                                                                                System.out.println(alinacaklar.get(k));





NOT: Dizide yapılan değişiklerden sonra diziyi yazdırmak istersek,
 dizinin boyutunu
.size() metodu ile göstermek daha doğru olacaktır.
         */
    }
}
