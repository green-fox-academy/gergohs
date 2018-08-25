import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class countLines2 {

    public static void main(String[] args) {

        Path original = Paths.get("lyrics2.txt");
        System.out.println(lineCounter(original));
    }


    private static int lineCounter(Path original) {


        int temp = 0;
        try {
            Files.isReadable(original);
            List<String> lyrics = Files.readAllLines(original);
            for (String line : lyrics) {
                temp++;
            }
        } catch (IOException e) {
        }
        return temp;
    }
}


