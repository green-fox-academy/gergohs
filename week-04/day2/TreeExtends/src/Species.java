public class Species extends Tree {

    public Species(String type, String leafColor, int age, String sex) {
        super(type, leafColor, age, sex);
    }

    public static void main(String[] args) {

        Species species = new Species("oak", "brown", 50, "male");

        species.printTree();
        //setType átírja a species-en belüle a type-ot, a többi értelemszerűen...
        species.setType("palm");
        species.setLeafColor("yellow");
        species.setAge(25);
        species.setSex("male");
        species.printTree();

        species.setType("pine");
        species.setLeafColor("green");
        species.setAge(70);
        species.setSex("male");
        species.printTree();

        species.setType("ash");
        species.setLeafColor("light green");
        species.setAge(60);
        species.setSex("female");
        species.printTree();

        species.setType("apple");
        species.setLeafColor("dark green");
        species.setAge(15);
        species.setSex("male");
        species.printTree();

    }
}
