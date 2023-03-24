package Donguler;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass;
        boolean isPass = true;
        do {        //Do While döngüsünde döngüye girmeden önce işlem yaptırabiliriz.
            System.out.println("Şifre giriniz: ");
            pass = input.nextInt();
            if (pass == 123) {
                System.out.println("Doğru");
                isPass = false;
            } else {
                System.out.println("Yanlış");
            }


        } while (isPass);

    }
}

