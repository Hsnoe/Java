package ikincibolum;
import java.util.Scanner;
public class hesapmakinesiporgram {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama işlemi\n2-Çıkarma işlemi\n3-Çarpma işlemi\n4-Bölme işlemi");
        System.out.println("seçiminiz:");
        select = input.nextInt();

        if (select==1){
            System.out.println("sonuc:"+(n1+n2));
        } else if (select==2) {
            System.out.println("sonuc:"+(n1-n2));

        } else if (select==3) {
            System.out.println("sonuc:"+(n1*n2));

        } else if (select==4) {
            if (n2!=0){
                System.out.println("sonuc:"+(n1/n2));

            }else{
                System.out.println("0 a bölünmez");
            }



        }else{
            System.out.println("yanlış seçim yaptınız.Please again");
        }

    }
}
