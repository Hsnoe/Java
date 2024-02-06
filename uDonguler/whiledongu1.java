package uDonguler;
import java.util.Scanner;
public class whiledongu1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int i=1;
       int k;
       int left=100;
       int rigth=200;
       int password;
       boolean success=false;
        System.out.println("program başladı");
       while(i<=10){
           System.out.println(i);
           i++;

           k=1;
           while (k<=10){
               System.out.print((k+"."));
               k++;

           }
           System.out.println();
       }
        System.out.println("program bitti ");

       while (++left< --rigth){


       }
        System.out.println("ortdaki değer ;"+left);



        while (success==false){
            System.out.println("şifre giriniz");
            password=scanner.nextInt();

            if (password !=1234){
                System.out.println("şifre yanlışş girdiniz");

            }
            else {
                System.out.println("şifre doğru");
                success=true;
            }
        }

       }
    }


