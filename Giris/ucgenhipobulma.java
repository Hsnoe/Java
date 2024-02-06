package Giris;
import java.util.Scanner;
public class ucgenhipobulma {
    public static void main(String[] args) {
        //değişkenleri belirle
        int a,b;
        double c;
        Scanner imp = new Scanner(System.in);
        System.out.println("a kenarını gir");
        a = imp.nextInt();
        System.out.println("b kenarını gir");
        b = imp.nextInt();

        //hesapla c=(a*a)+(b*b);
        c= Math.sqrt((a*a)+(b*b));
        System.out.println("hipotenüs uzunluğu"+c);

    }
}
