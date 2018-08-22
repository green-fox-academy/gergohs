import java.util.ArrayList;


public class GradeAnalyzer {

    public GradeAnalyzer() {
    }

    public void getAverage(ArrayList<Integer> grades) {
        if (grades.size() < 1) {
            System.out.println("The list is empty!");
        } else {
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            int average = sum / grades.size();
            System.out.println(average);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> myClassroom = new ArrayList<Integer>();

        myClassroom.add(98);
        myClassroom.add(92);
        myClassroom.add(88);
        myClassroom.add(75);
        myClassroom.add(61);
        myClassroom.add(89);
        myClassroom.add(95);

        GradeAnalyzer myAnalyzier = new GradeAnalyzer();

        myAnalyzier.getAverage(myClassroom);

    }
}

