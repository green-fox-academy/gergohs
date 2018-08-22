public class ExamplePostIts extends PostIt {

    private ExamplePostIts(String backGroundColor, String text, String textColor) {
        super(backGroundColor, text, textColor);
    }
    
    public static void main(String[] args) {

        ExamplePostIts postIt = new ExamplePostIts("black", "Hi, how are you?", "white");

        postIt.showPostIt();

        postIt.setBackGroundColor("orange");
        postIt.setText("Hola, Como estas?");
        postIt.setTextColor("blue");
        postIt.showPostIt();

        postIt.setBackGroundColor("green");
        postIt.setText("Bonjour, Ca va?");
        postIt.setTextColor("red");
        postIt.showPostIt();

    }
}
