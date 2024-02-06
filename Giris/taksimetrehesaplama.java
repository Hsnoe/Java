package Giris;
import java.util.Scanner;
public class taksimetrehesaplama {
    public static void main(String[] args) {

        //kaç km gittiği değeri girsin
        double km,tutar,kmbasıfiyat=2.20,giris=10;

        Scanner imp = new Scanner(System.in);
        System.out.println("kaç km gittiniz =");
        km = imp.nextDouble();

        tutar = km*kmbasıfiyat;
        tutar+=giris;
        tutar = (tutar<20) ? 20: tutar;
        System.out.println("ödenecek tutar="+tutar);

        /*boolean koşul1 = tutar<20,koşul2 = tutar>20;
        String str = koşul1? "20 tl ödenecek":"";
        System.out.println(str);*/




    }
}
