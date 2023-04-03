package Metotlar;

public class Recursive {
    /* Java'da Recursive metotlar, bir metodun kendisini çağırma tekniğidir. Bu teknik karmaşık problemleri, çözmesi
    * daha kolay problemlere ayırmayı sağlar. İki sayıyı birbirine eklemek kolaydır, ancak bir dizi sayıyı birbirine
    * eklemek daha karmaşıktır. Recursive metotlar sürekli kendilerini çağırdıkları için dikkat edilmesi gereken
    * durum en son aşama için koşul koyulmasıdır.   */

    // Beynim yandı çok açıklayamadım bende deneye deneye çözücez artık :/
    static int f(int n) {
        System.out.println("n= " + n);
        if (n == 1) {
            return 1;
        }
        int result = f(n - 1) + n;
        System.out.println("result= " + result);
        return result;


    }

    public static void main(String[] args) {
        System.out.println(f(3));
        //f(4)=f(3)+4
        //f(3)=f(2)+3
        //f(2)=f(1)+2
        //f(1)=1

        //f(n)=f(n-1)+n

    }


}
