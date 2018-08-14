import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

// Write a program that opens a file called "my-file.txt", then prints
// each of the lines form the file.
// If the program is unable to read the file (for example it does not exists),
// then it should print an error message like: "Unable to read file: my-file.txt"


public class printEachLine {

    public static void main(String[] args) {

        Path originalFile = Paths.get("my-files.txt");

            try {
                List<String> lyrics = Files.readAllLines(originalFile);
                for (String lyric : lyrics) {
                    System.out.println(lyric);
                }
            } catch (Exception e) {
                System.out.println("Could not read the file");
            }

    }
}

