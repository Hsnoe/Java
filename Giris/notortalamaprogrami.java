package Giris;
import java.util.Scanner;

public class notortalamaprogrami {
    public static void main(String[] args) {
        // değişkenleri belirle
        int math,fizik,kimya,tarih,turkce,muzik;

        // input tanımla
        Scanner ipt = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.println("fizik notunuz =");
        fizik = ipt.nextInt();
        System.out.println("kimya notunuz =");
        kimya = ipt.nextInt();
        System.out.println("tarih notunuz =");
        tarih = ipt.nextInt();
        System.out.println("turkce notunuz =");
        turkce = ipt.nextInt();
        System.out.println("muzik notunuz =");
        muzik = ipt.nextInt();
        System.out.println("math notunuz =");
        math = ipt.nextInt();

        // ortalamayı hesapla ekrana bas
        int ort = (math+fizik+kimya+muzik+turkce+tarih);
        double sonuc = ort/6;
        System.out.println("not ortalamanız ="+sonuc);

        //ek olarak
        boolean koşul = sonuc>50;
        String str = koşul? "geçti": "kaldı";
        System.out.println(str);

    }
}
