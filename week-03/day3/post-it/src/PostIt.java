public class PostIt {

    String backGroundColor;
    String textOnIt;
    String textColor;

    public PostIt() {

    }

    public void showPostIt() {

        System.out.println("This is a(n) " + backGroundColor + " post-it with " + textColor + " text with the content of "
                + textOnIt);

    }
}
