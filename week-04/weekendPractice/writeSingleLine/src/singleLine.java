// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class singleLine {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("Charlie Brown");


        try {
            Path myfile = Paths.get("my-file.txt");
            Files.write(myfile, name);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
