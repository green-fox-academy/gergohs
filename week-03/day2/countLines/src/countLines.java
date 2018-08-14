import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class countLines {
    public static void main(String[] args) throws IOException {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.


        Path lyricsPath = Paths.get("my-files.txt");

        System.out.println(lineCounter(lyricsPath));

    }

    private static int lineCounter(Path lyricsPath) {

        int temp = 0;
        try {
            Files.isReadable(lyricsPath);
            List<String> lyrics = Files.readAllLines(lyricsPath);
            for (String line : lyrics) {
                temp++;
            }

        } catch (Exception e) {
        }

        return temp;
    }


}
