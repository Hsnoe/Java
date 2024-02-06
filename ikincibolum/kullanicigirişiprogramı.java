package ikincibolum;
import java.util.Scanner;
public class kullanicigirişiprogramı {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);

        System.out.print("enter a username:");
        username = input.nextLine();

        System.out.print("enter a passsword:");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("giriş yaptınız !");
        }else {
            System.out.println("giriş başarısız !");
        }
    }
}
