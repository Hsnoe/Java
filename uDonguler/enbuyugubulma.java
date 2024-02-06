package uDonguler;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class enbuyugubulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n,z,c=1;
        System.out.println("kaç tane sayı giriceksin:");
        n =scanner.nextInt();

        System.out.println("1.sayıyı giriniz :");
        int sayi=scanner.nextInt();
        int enbuyuk=sayi;
        int enkucuk=sayi;

        for(int i = 2; i<n;i++ ){
            System.out.println(i+".sayıyı giriniz :");
            sayi=scanner.nextInt();
            if (sayi>enbuyuk){
                enbuyuk=sayi;
            }
            if (sayi<enkucuk){
                enkucuk=sayi;
            }

        }
        System.out.println("en büyük sayı :"+enbuyuk);
        System.out.println("en küçük sayı "+ enkucuk);


    }
}
