package Giris;

public class degiskenler {
    public static void main(String[] args) {
        int kisakenar = 10;
        int uzunkenar = 20;
        int cevre =2*(kisakenar+uzunkenar);
        int alan = (kisakenar*uzunkenar);
        System.out.println(cevre);
        System.out.println(alan);


        int numberone =0;
        int numbertwo =5;
        numberone=numbertwo;
        System.out.println(numberone);

        /*uzunluklarına göre 8 16 32 64 veri tipleridir*/
        byte vbyte =100;
        short vshort = 1000;
        int vınt = 10000;
        long vlong =1000000;
        System.out.println(vbyte);
        System.out.println(vshort);
        System.out.println(vınt);
        System.out.println(vlong);



        float vfloat = 4 ;
        double vdouble = 8.4 ;
        System.out.println(vfloat);
        System.out.println(vdouble);


        /*charlar stringleri oluşturur unicode*/
        char vchar ='a' ;
        char v2char = 100 ;
        System.out.println(vchar);
        System.out.println(v2char);


        char a1 = 'j' ;
        char a2 = 'a' ;
        char a3 = 'v' ;
        char a4 = 'a' ;
        System.out.println(a1+a2+a3+a4);
        System.out.println("" + a1+a2+a3+a4);




        boolean yanlis=false;
        boolean dogru =true;
        System.out.println(yanlis);


        String vstr="java patika ders";
        System.out.println(vstr);


    }
}
