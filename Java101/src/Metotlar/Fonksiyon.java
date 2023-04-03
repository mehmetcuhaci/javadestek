package Metotlar;

public class Fonksiyon {
    /* Fonksiyon tanımı matematiktekiyle birebir aynı çalışır aşağıda pow fonksiyonu tanımlayıp içine kullanıcağımız
    * ifadeleri tanımladık. Fonksiyon içine veri tipini belirtmemiz lazım yoksa hata alırız.
    * return geri dönüş sağlar return komutunu sağlamazsak hata alırız.
    * özel fonksiyonları genelde main metotundan yukarıya yazılır genel olanlar aşağısına.
    *  */

    static int pow(int base,int exp) { // static fonksiyonunu sadece static metotlarda kullanabiliriz.
        int result=1;
        for (int i = 1; i <= exp; i++) {
            result*=base;
        }
        return result;
    }
    static void hello() { //static void komutu geri dönüşü olmayan fonksiyonlarda kullanılır.
        System.out.println("HelloWorld!");
    }
    static int top(int x) {
        x=10;
        return x;
    }
    static int toplama(int a,int b) {
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(pow(2,3));
        hello();
        hello();
        hello();

        int x=25;
        System.out.println(top(5));

        int sonuc=toplama(5,70);
        System.out.println(sonuc);


    }
}
