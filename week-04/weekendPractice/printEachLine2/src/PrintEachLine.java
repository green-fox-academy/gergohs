import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {

    public static void main(String[] args) {

        Path origin = Paths.get("lyrics.txt");

        try {
            List<String> lyrics = Files.readAllLines(origin);
            for (String lyric : lyrics){
                System.out.println(lyric);
            }

            } catch (IOException e) {
            System.out.println("Cound not read the file: lyrics!");
        }


    }

}
