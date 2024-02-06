package ikincibolum;
import java.util.Scanner;
public class switchcasedefault {
    public static void main(String[] args) {
        /*int day;
        System.out.println("gün giriniz=");
        Scanner input = new Scanner(System.in);
        day = input.nextInt();
        if (day ==1){
            System.out.println("bugün pazartesi");
        } else if (day==2) {
            System.out.println("bugün salı");
        } else if (day ==3) {
            System.out.println("bugün çağşamba");
        }else if (day ==4) {
            System.out.println("bugün perşembe");
        }else if (day ==5) {
            System.out.println("bugün cuma");
        }else if (day ==6) {
            System.out.println("bugün cumartesi");
        }else if (day ==7) {
            System.out.println("bugün pazar");

        }else{
            System.out.println("hatalı giriş yaptınız");
        }*/


       int day =3;
        switch (day) {
            case 1:
                System.out.println("bugün pazartesi");
                System.out.println("program finish");
                break;
            case 2:
                System.out.println("bugün salı");
                break;
            case 3:
                System.out.println("bugün çarşamba");
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
        }
    }

}
