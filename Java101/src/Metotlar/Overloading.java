package Metotlar;

public class Overloading {
    /* Overloading işlemi aynı isimde olan fonksiyonu farklı tanımlamalarla kullanmaya denir. */
    static void func() {
        System.out.println("Parametresiz");
    }

    static void func(int a) {
        System.out.println("Parametreler " + a);
    }

    static void func(double a) {
        System.out.println("Parametreler double " + a);
    }

    static int func(int a, int b) {
        return a + b;
    }

    static int func(int a, int b, int c) {
        return a + b + c;
    }
    static void show(int a, char b) {
        System.out.print("PATİKA PATİKA ");
    }

    static void show(char a, int b) {
        System.out.print("DEV DEV ");
    }


    public static void main(String[] args) {
        func();
        func(12);
        func(12.0);
        System.out.println(func(10,20));
        System.out.println(func(5,7,30));
        show(25, 'A');
        show('B', 11);
    }
}
