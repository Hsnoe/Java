package metodlar;

public class tanım {

    static int power(int base,int exp){
        int result=1;
        for (int i=1; i<=exp;i++)
            result*=base;
        return result;
    }

    static int sum(int a,int b){
        int result =2;
        return result;
    }

    static void summ(int v,int z){   // geri döndürmezz
        int res = v+z;
        System.out.println(res);

    }

    public static void main(String[] args) {

        System.out.println(power(5,2));

        System.out.println(sum(5,3));

        summ(8,7);



    }
}
