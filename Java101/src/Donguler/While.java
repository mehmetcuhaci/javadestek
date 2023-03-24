package Donguler;

public class While {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Program Başladı");
        /* While döngüsü javanın temel yapı taşlarından biridir. While terimi yazıldıktan sonra parantez içine bir
        boolean değer girilir. Sonrasında bir kod bloğu açılıp döngüde ne olucağı bu kod bloğunun içine yazılır.
        While'da parantez içine yazdığımız değer true olana kadar döngü çalışmaya devam eder. Eğer true olabilicek bir
        durum yoksa infiniti loop yani sonsuz döngüye girer.
         */
        while (i <= 5) {             // i, beşten küçük eşit olana kadar false. i, beş olduğunda döngü true olup biter.
            System.out.println(i);
            i++;         /* i'yi birer arttır eğer i'yi arttırmazsak sürekli 1 yazıp 5 e eşit olamayacağı için sonsuz
                           döngüye girer*/

        }
        System.out.println("Program Bitti");

    }
    //Eğer tüm kodu baştan aşağı algoritmik bir şekilde okunursa daha iyi anlaşılır.
}
