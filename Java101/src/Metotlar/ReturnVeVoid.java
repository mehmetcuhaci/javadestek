package Metotlar;

public class ReturnVeVoid {
    /*OLUŞTURDUĞUMUZ METOT BİZE DEĞER ÜRETMESİNİ İSTEDİĞİMİZDE/BİZE DEĞER VERİCEKSE RETURN KULLANILIR
    Bunu nasıl anlıyacağımız ise veri tipi girdiğimizde belli olur yani sum fonksiyonuna int tanımladığımız için return kullandık
     Geri dönecek değerin veri tipi, metot tanımlarken verdiğimiz veri tipi ile aynı olmalıdır.*/
    static int sum(int a,int b) {
        return a+b;
    }
    /*  Sadece metot içindeki kod bloğunun çalışmasını istersek void kullanırız.
    * Void içinde return kullanılabilir hata alınmaz.*/
    static void num(int x,int y) {
        int result=x+y;
        System.out.println(result);
    }

    public static void main(String[] args) {
        int result=sum(5,20);
        System.out.println(result);

      //  int res=num(5,7);   bu kodu kullanmaya çalışırsak hata alırız çünkü geriye değer döndürmediği için
        num(13,20); //kendi fonksiyonu içinde yazdırırsak fonksiyodu burada kullanabiliriz



    }

}
