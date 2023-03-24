package Donguler;

import java.util.Scanner;

public class WhileDort {
    public static void main(String[] args) {
        String userPassword = "123";
        boolean isPasswordSuccess = false;
        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess) {

            System.out.print("Şifrenizi giriniz: ");
            userPassword = input.nextLine();
            if (userPassword.equals("123")) {
                isPasswordSuccess = true;
                System.out.println("Girişi başarılı!");

            } else {
                System.out.println("Şifre Yanlış!");
            }


        }

    }
}
