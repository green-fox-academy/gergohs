package main.java.animals;

public class Mammals extends Animal{

    public Mammals(String name, int age) {
    super(name, age);
    }

    public Mammals(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }


}

