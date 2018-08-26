import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static PostIt orangePostIt = new PostIt("orange", "Idea1!", "blue");
    static PostIt pinkPostIt = new PostIt("pink", "Awesome!", "black");
    static PostIt yellowPostIt = new PostIt("yellow", "Superb!", "green");

    public static void main(String[] args) {

        ArrayList<PostIt> postiItList = new ArrayList<PostIt>();

        postiItList.add(orangePostIt);
        postiItList.add(pinkPostIt);
        postiItList.add(yellowPostIt);

        System.out.println(postiItList);

        System.out.println(orangePostIt.getBackgroundColor());
        orangePostIt.setBackgroundColor("red");
        System.out.println(orangePostIt.getBackgroundColor());
    }
}
