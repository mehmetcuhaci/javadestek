package IfVeSwitch;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yas;
        double kilo;
        System.out.print("Yaşınızı Giriniz: ");
        yas = input.nextInt();

        System.out.print("Kilonuzu Giriniz: ");
        kilo = input.nextDouble();

        if (yas > 18) {                //if eğer anlamı taşır koşul belirtir.
            if (kilo < 45) {
                System.out.println("Kilonuz 45'in altında kan veremezsiniz");
            } else if (kilo > 120) {   //else if araya ihtimal ekler.
                System.out.println("Kilonuz çok yüksek kan veremezsiniz.");
            } else {        //else en son ihtimali verir.
                System.out.println("Kan Verebilirsiniz.");
            }

        } else {
            System.out.println("Kan verebilmek için yaşınız 18den büyük olmalı.");
        }


    }
}
