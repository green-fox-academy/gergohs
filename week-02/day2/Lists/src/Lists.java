import java.util.ArrayList;
import java.util.Arrays;

public class Lists {
    public static void main(String[] args) {

        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList
                ("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        System.out.println(putSaturn(planetList));


    }

    private static ArrayList<String> putSaturn(ArrayList<String> planetList) {

        planetList.add(5, "Saturn");

        return planetList;
    }
}
