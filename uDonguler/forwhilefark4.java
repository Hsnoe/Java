package uDonguler;
import java.util.Scanner;
public class forwhilefark4 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int sayi;
       for(boolean i = true; i==true;){
           System.out.println("negatif  sayı giriniz :");
           sayi= scanner.nextInt();
           if(sayi<0)
           {
               System.out.println("negatif sayı girdiniz");
               i=false;
           }
           else {
           }
       }

       int sayi2;
        System.out.println("negatif sayı giriniz:");
        sayi2=scanner.nextInt();

       while (sayi2>0){
           System.out.println("sayı ggiriniz");
           sayi2=scanner.nextInt();


       }


    }
}
