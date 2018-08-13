public class CountAs {

    public static void main(String[] args) {

        String example = "Apple";

        System.out.println(charCounter(example));
    }

    private static String charCounter(String example) {

        String temp = example.toLowerCase();
        if (temp.contains("a")) {
            return "1";
        } else {
            return "0";
        }

    }
}

