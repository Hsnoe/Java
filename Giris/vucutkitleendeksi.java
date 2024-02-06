package Giris;
import java.util.Scanner;
public class vucutkitleendeksi {
    public static void main(String[] args) {

        double boy,kilo,vki;

        Scanner imp = new Scanner(System.in);
        System.out.println("boyunuzu metre cinsinde giriniz =");
        boy = imp.nextDouble();
        System.out.println("kilonuzu giriniz =");
        kilo = imp.nextDouble();

        vki = kilo/(boy*boy);
        System.out.println("vücüt kitle endeksiniz ="+vki);


    }
}
