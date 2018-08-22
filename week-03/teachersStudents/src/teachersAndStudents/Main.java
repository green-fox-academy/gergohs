package teachersAndStudents;

public class Main {

    public static void main(String[] args) {

        Students Johnny = new Students();
        Students Mike = new Students();
        Students Monica = new Students();
        Students Franky = new Students();

        Teacher MrGorsky = new Teacher();

        Johnny.question(MrGorsky);

        MrGorsky.teach(Johnny);
    }
}

class Teacher {

    public Teacher() {
    }

    public void answer() {

        System.out.println("Answering...");
    }

    public void teach(Students students) {

        students.learn();
    }
}


class Students {

    public Students() {
    }

    public void learn() {

        System.out.println("Learning...");
    }

    public void question(Teacher teacher) {
        teacher.answer();

    }

}
