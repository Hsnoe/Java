package Giris;

import java.util.Scanner;

public class temeloperatorler {
    public static void main(String[] args) {
        int a = 7 ;
        int b = a ;
        System.out.println(b);

        /*a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
        a*=b;
        System.out.println(a);*/
        a/=b;
        System.out.println(a);


        int c=5 , d=3;
        boolean sonuc = c>d ;
        System.out.println(sonuc);


        int s=11,z=8,f=10;
        boolean kosul1 = s>z;
        boolean kosul2 = z>f;

        boolean result= kosul1 && kosul2;
        boolean result2= kosul1 || kosul2;
        System.out.println(result);
        System.out.println(result2);

        String str = result ? "doğru": "yanlış";
        System.out.println(str);


        // input alma
        /*int x;
        Scanner input = new Scanner(System.in);
        System.out.print("bir x giriniz");
        x = input.nextInt();
        System.out.println(x);*/


        Scanner input = new Scanner(System.in);
        System.out.print("bir x giriniz");
        String v = input.nextLine();
        System.out.println(v);


    }
}