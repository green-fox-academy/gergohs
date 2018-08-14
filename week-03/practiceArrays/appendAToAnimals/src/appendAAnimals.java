// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

public class appendAAnimals {
    public static void main(String[] args) {

        String[] animals = {"koal", "pand", "zebr"};

        for (int i = 0; i < animals.length; i++) {
            System.out.print((animals[i] + "a") + ", ");
        }

    }
}
