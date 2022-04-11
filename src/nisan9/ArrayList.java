package nisan9;

public class ArrayList {
    public static void main(String[] args) {
        /*
        Yazılım ile ilgili bir eğitim verilecek.
         Eğitimde almak istediklerimizi klavyeden bir diziye
          aktaracağız. Daha sonra aldığımız eğitimlerden herhangi
          birini klavyeden girdiğimizde hangi sırada olduğunu öğreneceğiz.
          Yani dizideki herhangi bir elemanın sırasını yazdıran programı
           “array” ile yazacagiz.
         */
        /*
        cozum yolu
        İlk olarak, kaç adet eğitim almak istediğimizi giriyoruz. Yani dizimizin boyutunu belirliyoruz.
           int n=klavye.nextInt();

Array metodu ile string yapıdaki dizimiz oluşturuyoruz.
           ArrayList<String> dersler =new ArrayList<String>();

For döngüsü ile n elemanlı dizimize değer atıyoruz.
          for(int i=0;i<n;i++){                                                                                                                           dersler.add(klavye.next());                                                                                                                   }

Aldığımız dersleri karışmaması için bir kez daha yazdırıyoruz.
          System.out.println(“Aldığınız Dersler :”);                                                                                          for(int k=0;k<n;k++){                                                                                                                          System.out.println(dersler.get(k));                                                                                                      }

Sırasını öğrenmek istediğimiz dersi klavyeden aratıyoruz bir sonraki adımımızda.
          String ara=klavye.next();

Daha sonra ise bir if döngüsü oluşturarak koşullarımızı sağlayan elemanın ekrana yazdırılmasını istiyoruz.
       if(dersler.contains(ara)==true){                                                                                                           System.out.println(“Eklediğiniz Ders :”+ ara);                                                                                   System.out.println(“Eklediğiniz Dersin Eğitimini “+(dersler.indexOf(ara)+1)+”. Sırada Alacaksınız”);



NOT 1: .contains metodu ile dizide arattığımız eleman true değerini döndürüyorsa if döngüsünün içerisine girsin istiyoruz. Eğer arattığımız eleman dizide mevcut değilse else’in içerisine girecek ve döngü burada sonlanacaktır.



NOT 2: .indexOf metodu ile dizide aradığımız elemanın indisini yani sırasını öğrenmiş oluyoruz. Ancak Java’da elemanlar 0’dan başladığı için +1 değerini de eklemiş olduk.
         */
    }
}
