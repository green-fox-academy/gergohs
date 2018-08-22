public class PostIt {

    private String backGroundColor;
    private String text;
    private String textColor;

    protected PostIt(String backGroundColor, String text, String textColor) {
        this.backGroundColor = backGroundColor;
        this.text = text;
        this.textColor = textColor;
    }

    protected void showPostIt() {
        System.out.println("This is a " + backGroundColor + " post-it with " + textColor +
                " text and it contains the following: " + text);
    }


    protected void setBackGroundColor(String backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    protected void setText(String text) {
        this.text = text;
    }

    protected void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}
