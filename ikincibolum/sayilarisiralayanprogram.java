package ikincibolum;
import java.util.Scanner;
public class sayilarisiralayanprogram {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("sayı giriniz:");
        Scanner imp = new Scanner(System.in);
        a = imp.nextInt();
        b = imp.nextInt();
        c = imp.nextInt();

        if (a<b && c<b){
            if (c<a){
                System.out.println("b > a > c");
            }else{
                System.out.println("b > c > a");
            }

        }else if (b<a && c<a) {
            if (b<c){
                System.out.println("a > c > b");
            }else {
                System.out.println("a > b > c");
            }

        }else if (a<c &&  b<c) {
            if (c<a){
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }

        }



    }
}
