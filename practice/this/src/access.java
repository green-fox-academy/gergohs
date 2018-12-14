public class access {

    public static void main(String[] args) {

        timeSettings tc = new timeSettings();

        System.out.println(tc.displayTime());

        tc.setTime(4,5,6);
        System.out.println(tc.displayTime());

        timeSettings tc2 = new timeSettings();

        System.out.println(tc2.displayTime());
        tc2.setTime(10,20,30);
        System.out.println(tc2.displayTime());
    }

}
