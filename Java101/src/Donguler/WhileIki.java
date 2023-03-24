package Donguler;
// Derleyici gibi kodumuzu okuyalım
public class WhileIki {
    public static void main(String[] args) {
        int i = 1, k;          //i,bire eşit ve k tam sayısı var.
        System.out.println("Program başladı.");
        while (i <= 5) {  //i, beşe küçük eşit olana kadar
            System.out.println(i);  //i'yi yazdır
            k = 1;
            while (k <= 10) {  //k 10'a küçük eşit olana kadar
                System.out.print(k + ",");
                k++;  //k'yı bir arttır
            }
            System.out.println();  //alta geçsin diye boş bıraktık
            i++;  // ve en son i'yi bir arttırıp en başa dönücek.
        }
        System.out.println("Program bitti.");

    }
}
