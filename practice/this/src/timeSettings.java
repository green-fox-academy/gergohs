public class timeSettings {

    private int hour = 1;
    private int minute = 2;
    private int sec = 3;

    public void setTime(int hour, int minute, int sec) {
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
    }

    public String displayTime(){
        return String.format("%02d:%02d:%02d", hour, minute, sec);
    }

}
