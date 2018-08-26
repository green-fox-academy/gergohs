// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.

public class Reverse {
    public static void main(String[] args) {

        String original = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(original));
    }

    private static String reverse(String original) {

        return new StringBuilder(original).reverse().toString();
    }
}