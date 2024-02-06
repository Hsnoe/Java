package uDonguler;

import java.util.Scanner;

public class girilençiftprogram {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("bir sayı girinniz:");
        int sayi=scanner.nextInt();

        for (int i=0;i<sayi;i++)
        {
            if(i%2==0){
                System.out.println("çift sayılar :"+i);
            }

        }

        int ttp=0;
        System.out.println("bir sayi giriniz");
        int sayi1=scanner.nextInt();

        for (int i =0; i<sayi1;i++)
        {
            if (i%2==1){
                ttp+=i;

            }


        }
        System.out.println("tek sayılar toplamı :"+ttp);

    }



}
