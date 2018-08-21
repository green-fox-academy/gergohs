package greenfoxorg;

public class Mentor extends Person {
    String level;

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge()+ " year old " + getGender()+ " level mentor.");
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name,age,gender);
        level = "intermediate";
    }

    public Mentor () {
        super();
        this.level = "intermediate";
    }

}
