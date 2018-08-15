public class sampleBlogs {
    public static void main(String args[]) {


        BlogPost firstBlog = new BlogPost();

        firstBlog.author = "John Doe";
        firstBlog.title = "Lorem ipsum";
        firstBlog.text = "Lorem ipsum dolor sit amet.";
        firstBlog.publicationDate = "2000.05.04.";

        firstBlog.blogDetails();

        System.out.println("------------------------------------------------------------");

        BlogPost secondBlog = new BlogPost();

        secondBlog.author = "Tim Urban";
        secondBlog.title = "Wait but why";
        secondBlog.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        secondBlog.publicationDate = "2000.10.10.";

        secondBlog.blogDetails();

        System.out.println("------------------------------------------------------------");

        BlogPost thirdBlog = new BlogPost();

        thirdBlog.author = "William Turton";
        thirdBlog.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        thirdBlog.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
                "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t " +
                "really into the whole organizer profile thing.";
        thirdBlog.publicationDate = "2017.03.28.";

        thirdBlog.blogDetails();

    }
}
