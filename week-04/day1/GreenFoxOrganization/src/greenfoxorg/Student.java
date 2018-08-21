package greenfoxorg;

public class Student extends Person {
    String previousOrganization;
    int skipDays = 0;

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from " + previousOrganization +
                " who skipped " + skipDays + " days from the course already.");
    }

    public void skipDays(int numberOfDays) {
        skipDays = skipDays + numberOfDays;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skipDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skipDays = 0;
    }

}


