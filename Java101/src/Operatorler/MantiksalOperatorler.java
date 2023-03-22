package Operatorler;

public class MantiksalOperatorler {
    public static void main(String[] args) {
        /*
        # Ve: a&&b
        # Veya: a||b
        #Değil !
         */
        int a=5,b=1,c=7;
        boolean kosul1=a>b;
        boolean kosul2=a<c;
        boolean sonuc= kosul1 && kosul2;

        System.out.println(sonuc);

    }
}
