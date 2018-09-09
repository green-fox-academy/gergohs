public class Main {

    public static void main(String[] args) {

        Carrier ussForrestal = new Carrier(5000,1000);

        ussForrestal.add(new F16());
        ussForrestal.add(new F16(0, 10));
        ussForrestal.add(new F35(0));
        ussForrestal.add(new F35());
        ussForrestal.add(new F35());



        Carrier hmsArkRoyal = new Carrier (4800,800);



    }
}
