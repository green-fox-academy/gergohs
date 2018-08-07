import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendA {
    public static void main(String[] args) {

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA((ArrayList) far));

    }

    private static ArrayList<String> apxpendA(ArrayList<String> far) {

        for (int i = 0; i < far.size(); i++) {
            far(i).set(1, "a");
        }
        System.out.println(far());

        return apxpendA();
    }

}

