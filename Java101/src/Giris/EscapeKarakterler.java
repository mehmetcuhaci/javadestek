package Giris;

public class EscapeKarakterler {
    public static void main(String[] args) {
        System.out.println("Hello \nWorld!"); //alt satıra geçmek için kullanılır
        System.out.println("Hello \tWorld!"); //bir tab boşluk ekler
        System.out.println("Hello \bWorld!"); //backspace ekler kendinden önceki harfi siler
        System.out.println("Hello \rWorld!"); //metne bir satır başı ekler kendinden önce yeri yok sayar gibi
        System.out.println("Hello \'World!\'"); //Tek tırnak eklemek için kullanılır
        System.out.println("Hello \"World!\""); //Çift tırnak eklemek için kullanılır
        System.out.println("Hello\\World!"); //Ters çizgi için kullanılır

    }
}
