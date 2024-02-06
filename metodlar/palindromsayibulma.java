package metodlar;

public class palindromsayibulma {

    static boolean ispalindrom(int number){

        int tmp =number,sonsayi,terssayi=0;
        while (tmp!=0){
            sonsayi=tmp % 10;    // son rakamı aldım
            terssayi = (terssayi*10)+sonsayi;
            tmp/=10;       // son rakamı sildim

        }

        if (number==terssayi)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {

        System.out.println(ispalindrom(11));

        int a= 2785;
        int b=a%10;
        int c=a/10;
        System.out.println(c);

    }
}
