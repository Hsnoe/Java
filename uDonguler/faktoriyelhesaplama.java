package uDonguler;

import java.util.Scanner;

public class faktoriyelhesaplama {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("bir sayyı girin");
        int fakbul= scanner.nextInt();
        int faktoriyel=1;
        for (int i=fakbul; i>0;i--){
            faktoriyel*=i;
        }
        System.out.println(fakbul+" in faktoriyeli:"+faktoriyel);

        System.out.println("------------------------------");

        int fak=1,cnt=0;
        System.out.println("5 tane faktoriyel sayı bulun ");
        for(int i=0;i<5;i++){
            int sayi=scanner.nextInt();
            while (sayi>0){
                fak*=sayi;
                sayi--;

            }
            cnt++;

            System.out.println(cnt+"  ınci faktoriyel = "+fak);
            fak=1;
        }



    }
}
