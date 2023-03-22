package IfVeSwitch;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*Switch case'de bir karar mekanizmasıdır. Bazı durumlarda if else'den daha okunaklı ve yararlı olabilir duruma
        göre ikisinden biri kullanılır. */

        Scanner input = new Scanner(System.in);
        int day;

        System.out.print("1 ile 7 arasında değer giriniz: ");
        day = input.nextInt();

        switch (day) {  //ifelsede olduğu gibi parantez içine durumu belirtmemiz lazım

            case 1:      //durum 1'de ne yapılacağını belirler
                System.out.println("Pazartesi");
                break;  //durum 1 gerçekleşirse kodun durması gerektiğini belirtir her case sonrası koyulur.
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:  //tüm olasılıklar dışında bir şey olduğunda ne yapılacağı yazılır
                System.out.println("Geçersiz değer girdiniz!");
        }


    }
}



