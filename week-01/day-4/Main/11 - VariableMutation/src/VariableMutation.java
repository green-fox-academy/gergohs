public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        System.out.println(a+10);

        int b = 100;
        System.out.println(b-7);

        int c = 44;
        System.out.println(c*2);

        int d = 125;
        System.out.println(d/5);

        int e = 8;
        System.out.println(e*e*e);

        int f1 = 123;
        int f2 = 345;

        System.out.println(f1>f2);

        int g1 = 350;
        int g2 = 200;

        System.out.println(g2*2>g1);

        int h = 135798745;
        System.out.println(h%11 !=0);

        int i1 = 10;
        int i2 = 3;

        System.out.println( (i1 > i2*i2) && (i1 < i2*i2*i2));

        int j = 1521;

        System.out.println(((j%3 == 0) || (j%5 == 0)));


    }

}
