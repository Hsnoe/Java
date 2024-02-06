package Giris;
import java.util.Scanner;
public class manavkasaprogram {
    public static void main(String[] args) {
        double armut=2.14,elma=3.6,muz=0.95,patlıcan=5.0,domates=1.11,kg,tutar;

        Scanner tmp= new Scanner(System.in);

        System.out.println("armut kaç kilo =");
        kg = tmp.nextDouble();
        tutar = armut*kg;
        //System.out.println(tutar);

        System.out.println("elma kaç kilo =");
        kg = tmp.nextDouble();
        tutar = tutar+elma*kg;
        //System.out.println(tutar);

        System.out.println("muz kaç kilo =");
        kg = tmp.nextDouble();
        tutar = tutar + muz*kg;
        //System.out.println(tutar);

        System.out.println("patlıcan kaç kilo =");
        kg = tmp.nextDouble();
        tutar = tutar+patlıcan*kg;
        //System.out.println(tutar);

        System.out.println("domates kaç kilo =");
        kg = tmp.nextDouble();
        tutar = tutar+domates*kg;
        System.out.println("toplam ücretiniz="+tutar);





    }
}
