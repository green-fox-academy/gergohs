package SharpiePackage;

public class Main {

    public static void main(String[] args) {

        SharpieSet listOfSharpies = new SharpieSet();


        listOfSharpies.add(new Sharpie("blue", 1.50f, 0));
        listOfSharpies.add(new Sharpie("green", 0.50f, 100));
        listOfSharpies.add(new Sharpie("red", 2.00f, 73));

        System.out.println(listOfSharpies);


        listOfSharpies.removeTrash();
        System.out.println(listOfSharpies);

        System.out.println("The number of usable sharpies are: " + listOfSharpies.countable());
    }



}
