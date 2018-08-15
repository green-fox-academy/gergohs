import javax.xml.bind.SchemaOutputResolver;

public class BlogPost {

    String author;
    String title;
    String text;
    String publicationDate;

    public BlogPost() {
    }

    public void blogDetails() {

        System.out.println(title + " titled by " + author + "posted at " + publicationDate);
        System.out.println("- " + text);
    }
}
