package Giris;
import java.util.Scanner;
public class kdvtutarınıbulanprog {
    public static void main(String[] args) {

        double para,kdvoran=0.18,kdvtutarı,kdvlipara;
        Scanner imp = new Scanner(System.in);
        System.out.println("bir para değeri girin=");
        para = imp.nextDouble();

        kdvtutarı = (para*kdvoran);
        kdvlipara=(kdvtutarı+para);
        System.out.println("paranın ham hali="+para );
        System.out.println("para kdv tutarı ="+kdvtutarı);
        System.out.println("paranın kdv eklenmiş hali="+kdvlipara );





    }
}
