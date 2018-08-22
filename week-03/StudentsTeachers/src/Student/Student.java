package Student;

public class Student {

    public Student() {
    }

    public void learn() {

        int knowledgeLevel = 0;

        knowledgeLevel++;

        System.out.println(
                "Student's knowledgelevel is: " +
                        +knowledgeLevel);
    }

    public void question(Teacher teacher) {

        teacher.answer();
    }
}
