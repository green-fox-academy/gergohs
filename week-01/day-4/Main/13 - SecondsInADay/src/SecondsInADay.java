public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalSecondsSpent = ((currentHours*3600)+(currentMinutes*60)+currentSeconds);
        int secondsInDay = 86400;

        System.out.println(secondsInDay-totalSecondsSpent);


    }
}
