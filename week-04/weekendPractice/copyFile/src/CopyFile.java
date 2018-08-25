// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(fileCopier("my-file.txt", "copied-file2.txt"));
    }

    private static boolean fileCopier(String original, String copied) {

        boolean result = true;
        try {
            Files.copy(Paths.get(original), Paths.get(copied));
        } catch (IOException e) {
            result = false;
        }
        return result;

     /* Path originalFile = Paths.get(original);
        Path copiedFile = Paths.get(copied);
        List<String> lines = Files.readAllLines(originalFile);
        Files.write(copiedFile, lines);
    */
    }
}
