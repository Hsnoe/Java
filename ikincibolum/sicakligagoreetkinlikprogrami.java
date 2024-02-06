package ikincibolum;
import java.util.Scanner;
public class sicakligagoreetkinlikprogrami {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("what is the heat:");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("you should go sking");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("you should go cinema");
            }
            if (heat >= 10) {
                System.out.println("you should barbecu");
            }
        }else {
            System.out.println("you should go swimm");
        }
    }
}
