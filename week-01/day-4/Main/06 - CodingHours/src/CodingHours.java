public class CodingHours {
    public static void main(String[] args) {

        //basic datas:
        int dailyCodingHours = 6;
        int weeks = 17;
        int workDaysPerWeek = 5;
        int workHoursPerWeek = 52;

        //calculation of percentage:
        int totalHoursPerSemester = weeks*workHoursPerWeek;
        int totalCodingHours = weeks*workDaysPerWeek*dailyCodingHours;
        double dubTotalHoursPerSemester = totalHoursPerSemester;
        double dubTotalCodingHours = totalCodingHours;

        //print results:
        System.out.println (weeks*workDaysPerWeek*dailyCodingHours + " hours spent with coding during the semester!");
        System.out.println((dubTotalCodingHours/dubTotalHoursPerSemester)*100 + " percentage of total time spent with coding during the semester!");

    }

}
