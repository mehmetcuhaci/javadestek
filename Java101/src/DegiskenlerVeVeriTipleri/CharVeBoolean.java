package DegiskenlerVeVeriTipleri;

public class CharVeBoolean {
    public static void main(String[] args) {
        char vChar='b';  //Char'da harf değişkeni tek tırnak içinde kullanılır
        char vChar2=98; /*Çıktıya baktığımızda 98'in, b ye denk geldiğini görürüz bu "ascii" tablosunda 98'in b anlamına
        geldiğini gösterir daha anlamak açısında ascii tablosuna internetten bakılabilir*/

        System.out.println(vChar);
        System.out.println(vChar2);

        char c1='J';
        char c2='A';
        char c3='V';
        char c4='A';

        System.out.println(c1+c2+c3+c4); /*Eğer böyle çalıştırırsak bize ascii tablosundaki sayısal değer karşılıkları-
        nın toplamını vericektir*/

        System.out.println(""+c1+c2+c3+c4); //Ama böyle string ifade olarak yazdırabiliriz.


        boolean dogru=true;   //Boolean koşul ve döngü işlemlerinde kullanılır mantıksaldır iki değer alabilir.
        boolean yanlis=false;

        System.out.println(dogru);
        System.out.println(yanlis);

    }
}
