import java.util.stream.IntStream;

public class Arrays {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>EXCERSIES: ARRAYS <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("***********************************excersie:Third **********************************");

        int[] q = {4, 5, 6, 7};
        System.out.println(q[3]);

        System.out.println("***********************************excersie:Compare length **********************************");

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};

        if (p2.length > p1.length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("***********************************excersie:Sum elements **********************************");

        int[] r = {54, 23, 66, 12};

        System.out.println(r[2] + r[3]);

        System.out.println("***********************************excersie:Change element **********************************");

        int[] s = {1, 2, 3, 8, 5, 6};
        s[4] = 4;
        System.out.println(s[4]);

        System.out.println("***********************************excersie:Increment element **********************************");

        int[] t = {1, 2, 3, 4, 5};
        t[3] = t[3] + 1;
        System.out.println(t[3]);

        System.out.println("*********************************** excersie:Print elements **********************************");

        int[] numbers = {4, 5, 6, 7};

        System.out.println(java.util.Arrays.toString(numbers));

        System.out.println("*********************************** excersie:Matrix **********************************");

/*        int[][] a = {{0, 1, 2, 3}, {0, 1, 2, 3}};

      for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[][]);
            }
            System.out.println();
     } */
        System.out.println("*********************************** excersie: Double items **********************************");


        int[] numList = {3, 4, 5, 6, 7};
        int[] numList2 = new int[numList.length];

        System.out.println("*********************************** excersie: Sum all elements **********************************");

        int[] ai = {3, 4, 5, 6, 7};

        int sum = IntStream.of(ai).sum();

        System.out.println(sum);

        System.out.println("*********************************** excersie: Sum all elements **********************************");

    }
}
