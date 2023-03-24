package Donguler;

public class WhileUc {
    public static void main(String[] args) {
        int left=100,right=200;

        while(++left<--right);   //Eğer while içinde bir işlem yapılmayacaksa noktalı virgül ilede kullanılabilir.

        System.out.println("Ortası "+left); //İki sayının keşimini buldu.

    }
}
