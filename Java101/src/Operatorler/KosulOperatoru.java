package Operatorler;

public class KosulOperatoru {
    public static void main(String[] args) {
        //Koşul operatörü "?"dir.
        int a=5,b=1,c=7;
        boolean kosul1=a>b;
        boolean kosul2=a<c;
        boolean sonuc= kosul1 || kosul2;

        String str= sonuc? "Doğru" : "Yanlış";
        System.out.println(str);
        //Eğer sonuç true ise doğru, false ise yanlış yazıcak
        //Koşul operatörü bir nevi eğer anlamı görür.


    }
}
