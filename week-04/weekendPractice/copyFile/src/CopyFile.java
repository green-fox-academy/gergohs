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
        fileCopier("my-file.txt", "copied-file.txt");
    }

    public static boolean fileCopier(String original, String copied) {
        try {
            Path originalFile = Paths.get(original);
            Path copiedFile = Paths.get(copied);
            List<String> lines = Files.readAllLines(originalFile);
            Files.write(copiedFile, lines);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
