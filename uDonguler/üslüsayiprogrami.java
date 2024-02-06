package uDonguler;

import java.util.Scanner;

public class üslüsayiprogrami {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("alt giriniz ");
        int taban=scanner.nextInt();
        System.out.println("üst giriniz ");
        int tavan = scanner.nextInt();
        int sayimiz=1,cnt=0;
        while (tavan>0){
            sayimiz*=taban;
            tavan--;
            cnt++;
        }
        System.out.println(taban + " üssü "+cnt+ " eşittir = "+sayimiz );



    }
}
