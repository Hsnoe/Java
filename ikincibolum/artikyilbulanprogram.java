package ikincibolum;
import java.util.Scanner;
public class artikyilbulanprogram {
    public static void main(String[] args) {
        int yil;
        System.out.println("bir yıl giriniz:");
        Scanner input = new Scanner(System.in);
        yil = input.nextInt();

        if((yil%4==0)){
            if   ((yil%100!=0)){
                System.out.println(yil+" "+"artık bir yıldır");

            } else if ((yil%100==0) && (yil%400==0)) {
                System.out.println("artık bir yıldır");

            }else {
                System.out.println("artık yıl değildir");
            }
        }else{
            System.out.println("artık yıl değil");
        }

    }
}
