package Giris.ikincibölüm;

public class mantikseloperatorler {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=20;
        int d=18;
        System.out.println(c!=d);

        boolean kosul1 = (a<b);
        boolean kosul2 = (c<=b);
        boolean sonuc = kosul1 && kosul2; /*bu &&(ve operatörü),bu // ve ya  operatörü*/
        System.out.println(sonuc);
        System.out.println(!sonuc);



        int z=5,s=10,g;
        g = (z>s) ? 1 : 0 ;  /* (kontrol edilecek ifade)> doğru olması durumunda*/
        System.out.println(g);
        String str = (z>s) ? "eşit" : "değil" ;
        System.out.println(str);
    }
}
