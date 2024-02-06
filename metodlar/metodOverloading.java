package metodlar;

public class metodOverloading {

    static void print(){
        System.out.println("parametresiz fonk");
    }

    static void print(int a){
        System.out.println("parametresi: "+ a);
    }

    static void print(double b){
        System.out.println("parametresi double  ;  "+ b);
    }

    static int print(int z,int g){
        return z+g;
    }
    public static void main(String[] args) {
        print();
        print();
        print(12);
        print(12.8);
        System.out.println(print(5,7));
    }
}
