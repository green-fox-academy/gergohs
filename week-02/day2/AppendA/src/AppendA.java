import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendA {
    public static void main(String[] args) {

        ArrayList<String> far = Arrays.asList ("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA((ArrayList) far));

    }

    private static ArrayList<String> appendA(ArrayList<String> far) {

        ArrayList<String> far2 = far;
        for (int i = 0; i < far.size(); i++) {
            far(i).set(1, "a");
        }
        System.out.println(far());

        return appendA();
    }

}

