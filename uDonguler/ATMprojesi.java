package uDonguler;

import java.util.Scanner;

public class ATMprojesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password,para=0,geripara,kalan=0;
        boolean a=true,z=true;






        while (a==true){

            System.out.println("kartınızın şifresini giriniz:");
            password= scanner.nextInt();
            if (password==3141){
                System.out.println("giriş yaptınız:");
                a=false;
                while (z==true){

                    System.out.println("yapacağınız işlemi seçiniz:");
                    System.out.println("--------------------");
                    System.out.println("1-para yatırma:");
                    System.out.println("2-para çekme:");
                    System.out.println("3-bakiye görüntüleme:");
                    System.out.println("4-çıkış yap");
                    int b =scanner.nextInt();
                    System.out.println("----------------");
                    if(b==1){
                        System.out.println("yatıracağınız tutarı girin:");
                        para=scanner.nextInt();
                        System.out.println(para +" tl yatırıldı");
                        kalan+=para;
                    }
                    else if (b==2){
                        System.out.println("çekeceğiniz tutarı giriniz :");
                        geripara=scanner.nextInt();
                        if (para > geripara){
                            System.out.println("çekme işleminiz başarrlı");
                            System.out.println(geripara+" tl çektiniz");
                            kalan=para-geripara;
                        }
                        else
                            System.out.println("çekme işleminiz başarısız");
                    }
                    else if(b==3){
                        System.out.println("kalan bakiye = "+kalan);

                    }
                    else{
                        System.out.println("çıkış yaptınız kartınızı lmayı unutmayın :");
                        z=false;

                    }



                }
                }
            else
                System.out.println("yanlış şifre tekrar deneyiniz");


        }

    }
}
