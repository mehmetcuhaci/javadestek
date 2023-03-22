package DegiskenlerVeVeriTipleri;

import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        //Vize %40,Final %60 ve ortalama olarak yap iste klasik
        Scanner giris= new Scanner(System.in); //Kullanıcıdan veri istemek için giris adında scanner kullandım

        int vize,fnl;
        double top;

        System.out.println("Vize Giriniz:");
        vize= giris.nextInt(); //veriyi bu kod ile isteriz next'ten sonra Int veya double gibi değişkenler gelir

        System.out.println("Final Giriniz:");
        fnl= giris.nextInt();

        top=(vize*0.4)+(fnl*0.6); // toplama değişkenini tanımladık.
        System.out.print("Notun:");
        System.out.print(top); //toplama değikenini ekrana yazdırdık.

    }
}
