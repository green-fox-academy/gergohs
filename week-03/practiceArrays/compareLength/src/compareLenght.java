// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`

public class compareLenght {

    public static void main(String[] args) {

        int[] p1 = {1, 2, 3};
        int[] p2 = {4, 5};

//with if:
        if (p2.length > p1.length) {
            System.out.println("P2 is bigger than P1");
        } else {
            System.out.println("P1 is the bigger one");
        }

// other way with boolean:
        System.out.println(p2.length > p1.length);

    }
}
