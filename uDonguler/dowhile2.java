package uDonguler;
import java.util.Scanner;
public class dowhile2 {
    public static void main(String[] args) {
       int year;
       boolean askpassword=false;
       int password;
       year=2001;
       do {              // amaç bir kerede olsa en azından çalışması dowihle
           System.out.println("yıl"+year);
           year++;
       } while (year<2001);


       while (year<2001){
           System.out.println("yıl"+year);
           year++;
       }

       do {
           System.out.println("şifre giriniz ");
           Scanner input=new Scanner(System.in);
           password=input.nextInt();
           if(password==12234){
               System.out.println("şifre doğru girdiniz");
               askpassword=true;
           }

           else{
               System.out.println("şifree yanış giridniz");
           }
       }while (askpassword==false);

    }
}
