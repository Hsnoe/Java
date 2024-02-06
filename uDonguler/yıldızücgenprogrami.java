package uDonguler;

import java.util.Scanner;

public class yıldızücgenprogrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaç satırlı olsuun");
        int n =scanner.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1; j<=(n-i);j++){         //boşluk ayarla
                System.out.print(" ");
            }

            for (int k=1; k<=(2*i-1);k++){     //boşluktan sonra gelecek yıldız sayısı
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
