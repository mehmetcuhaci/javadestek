package Metotlar;

public class LokalDegiskenler {
    /* Java'da lokal değişkenler kod blokları içerisinde tanımlanan değişkenlerdir ve sadece tanımlandıkları kod
    * blokları içerisinde kullanılabilirler. Diğer metot ve sınıflar üzerinden erişimleri yoktur. Lokal değişkenler
    * tanımlandıkları {...} kod blokları arasında kullanılırlar. */
    static void func(int a,int b) {
        a=25;
       // System.out.println(a);
    }
    static void dif() {
        int a=15;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a=20;
        int b=10;
        func(a,b);
        //System.out.println(a);
    }
}
