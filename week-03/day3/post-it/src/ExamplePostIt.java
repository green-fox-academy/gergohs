
import java.awt.*;

public class ExamplePostIt {
    public static void main (String args []) {

        PostIt orange = new PostIt();

        orange.backGroundColor = "orange";
        orange.textOnIt = "Idea 1";
        orange.textColor ="blue";

        orange.showPostIt();

        PostIt pink = new PostIt();

        pink.backGroundColor = "pink";
        pink.textOnIt = "Awesome";
        pink.textColor ="black";

        pink.showPostIt();

        PostIt yellow = new PostIt();

        yellow.backGroundColor = "yellow";
        yellow.textOnIt = "Superb";
        yellow.textColor ="green";

        yellow.showPostIt();

    }
}
