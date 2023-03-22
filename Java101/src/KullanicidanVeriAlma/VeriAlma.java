package KullanicidanVeriAlma;

import java.util.Scanner;  //Veri alan kodu çalıştırabilmek için Scanner sınıfını ekliyoruz.
public class VeriAlma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //input adında bir veri alma değişkeni girdik

      /*  int a;
        System.out.print("A Sayısını Giriniz:"); //kullanıcıdan a değişkenini tanımlamasını istedik

        a=input.nextInt();     //kullanıcıya a değişkenini tanımlattık

        System.out.println("A sayısı " +a +"\'dır");   */
        System.out.println("İstediğiniz Şeyi Yazın:");
        String str=input.nextLine();
        System.out.println(str);



    }
}
