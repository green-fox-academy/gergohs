public class greeter {
    public static void main(String[] args) {
//  From now on, create the usual class wrapper
//  and main method on your own.

// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`


        String a1 = "GreenFox";

        System.out.println(greet(a1));

    }

    private static String greet (String a1) {
        
        return "Greetings dear, " + a1;
    }


}
