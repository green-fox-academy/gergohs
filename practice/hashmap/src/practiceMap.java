import java.util.Collections;
import java.util.HashMap;

public class practiceMap {

    public static void main(String[] args) {

        HashMap<String, Integer> playerRegister = new HashMap();

        playerRegister.put("Tom", 200);
        playerRegister.put("Danny", 25);
        playerRegister.put("Joe", 456);
        playerRegister.put("Axel", 233);
        playerRegister.put("Mike", 978);
        playerRegister.put("Bob", 111);
        playerRegister.put("Andy", 679);

/*
print out single value based on key
 */
        System.out.println("\n**********print out a single value********** \n");
        System.out.println("Score of Bob: " + playerRegister.get("Bob"));
/*
check that Hashmap contains the searched name or not, if yes, prints it out
 */
        System.out.println("\n**********check for the searched key, if contains it, print out the value********** \n");
        String searchFor = "Mike";

        if (!playerRegister.containsKey(searchFor)) {
            System.out.println("No match");
        } else {
            System.out.println("The score of " + searchFor + " is: " + playerRegister.get(searchFor));
        }
/*
go through the Hasmap, prints out all the keys
 */
        System.out.println("\n**********print out all the keys**********\n");
        for (String s : playerRegister.keySet()) {
            System.out.println(s);
        }
/*
go through the Hasmap, prints out all the values
 */
        System.out.println("\n**********print out all the values**********\n");
        for (Integer num : playerRegister.values()) {
            System.out.println(num);
        }
/*
print out the key-value pairs with Singletonlist
 */
        System.out.println("\n**********Print out key-values pairs with Collections.singletonList************\n");
        System.out.println(Collections.singletonList(playerRegister));
/*
print out the key-value pairs with EntrySet
 */
        System.out.println("\n**********Print out EntrySet**********\n");

        System.out.println(playerRegister.entrySet());
/*
remove one key-value pair, and prints out all the keys and values again
 */
        System.out.println("\n**********print out keys-values after remove**********\n");
        playerRegister.remove("Tom");

        for (String s : playerRegister.keySet()) {
            System.out.println(s);
        }

        for (Integer num : playerRegister.values()) {
            System.out.println(num);
        }
/*
print out key-value pairs after remove, with foreach & entrySet
 */
        System.out.println("\n**********print out key-value pairs after remove, with foreach & entrySet**********\n");
        for (HashMap.Entry<String, Integer> pr : playerRegister.entrySet()) {
            System.out.println(pr.getKey() + " - " + pr.getValue());
        }
    }
}
