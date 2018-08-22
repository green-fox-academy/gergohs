package Student;

public class Main {
    public static void main(String[] args) {

        Teacher MrGorsky = new Teacher();
        Student Tommy = new Student();
        Student Mike = new Student();


        Tommy.question(MrGorsky);
        Mike.question(MrGorsky);


        MrGorsky.teach(Tommy);


    }
}
