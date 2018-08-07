public class Strings {
    public static void main(String[] args) {

        System.out.println("***************************************  simple replacement ***************************************");

        String example = "In a dishwasher far far away";

        System.out.println(example.replace("dishwasher", "galaxy"));

        System.out.println("*************************************** url fixer ***************************************");

        String url = "https//www.reddit.com/r/nevertellmethebots";
        String fixedUrl = url.replace("bots", "odds");
        String fixedUrl2 = fixedUrl.replace("https", "https:");

        url = fixedUrl2;

        System.out.println(url);

        System.out.println("*************************************** takes longer ***************************************");

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

       System.out.println(quote.replace("It you ", "It always takes longer than you "));

    }
}
