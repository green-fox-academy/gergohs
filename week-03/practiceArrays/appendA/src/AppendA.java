// - Create a string variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(typo)`

public class AppendA {
    public static void main(String[] args) {

        String typo = "Chinchill";

        System.out.println(appendAFUNC (typo));

    }

    private static String appendAFUNC(String typo) {

        return typo+"a";
    }
}
