package ikincibolum;

public class ifelsebloklari {
    public static void main(String[] args) {
        int a=19,b=16,c=8;
        /*if(a<b){
            a+=1;
            System.out.println(a);
            System.out.println("eşit değil");

        }
        else {
            System.out.println("eşit");

        }*/
        if (a<b && a<c){
            System.out.println("a en küçük");

        }else if (b<a && b<c){
            System.out.println("b en küçüük");
        }else  if (c<a && c<b){
            System.out.println("en küççük c");
        }
        System.out.println("program bitti");

        int z=9, x=10;
        if (z>x){
            if (z>=x){
                System.out.println("z büyükktür");
            }else{
                System.out.println("z küçüktür");
            }
        }else{
            System.out.println("z küçütür");
        }
    }
}
