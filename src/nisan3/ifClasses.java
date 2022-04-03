package nisan3;

public class ifClasses {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10 + 1);
        if (a < 5) {
            System.out.println("a 5 ten kucuk");
        } else System.out.println("a 5'tir veya dha buyuktur");

        int c = (int) (Math.random() * 10);
        //  if(c>5) c=c-2; c=c+5; bu kod ile asagidaki tamamen aynidi


        if (c > 5) {
            System.out.println(c = c - 2);
        } else System.out.println(c = c + 5);

        int d = (int) (Math.random() * 10);
        if(d>6){
            System.out.println(d + " 'ten buyuk");
        }else{
            if(d==6){
                System.out.println("d "+d+" tir");
            }else{
                System.out.println(d +" 5'ten kucuktur");
            }
        }
    }
}
