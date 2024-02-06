package ikincibolum;
import java.util.Scanner;
public class cinburcuhesaplama {
    public static void main(String[] args) {
        int born;
        String burc ="";
        Scanner imput = new Scanner(System.in);
        System.out.println("when were you born?");
        born = imput.nextInt();

        if((born%12)==0){
            System.out.println("çin burcunuz: maymun");
        } else if ((born%12)==1) {
            System.out.println("çin burcunuz:horoz");
        } else if ((born%12)==2) {
            System.out.println("çin burcunuz:köpek");
        } else if ((born%12)==3) {
            System.out.println("çin burcunuz:domuz");
        }else if ((born%12)==4) {
            System.out.println("çin burcunuz:fare");
        }else if ((born%12)==5) {
            System.out.println("çin burcunuz:öküz");
        }else if ((born%12)==6) {
            System.out.println("çin burcunuz:kaplan");
        }else if ((born%12)==7) {
            System.out.println("çin burcunuz:tavşan");
        }else if ((born%12)==8) {
            System.out.println("çin burcunuz:ejderha");
        }else if ((born%12)==9) {
            System.out.println("çin burcunuz:yılan");
        }else if ((born%12)==10) {
            System.out.println("çin burcunuz:at");
        }else if ((born%12)==11) {
            System.out.println("çin burcunuz:koyun");
        }
        else {
            System.out.println("hatalı giriş");
        }


    }
}
