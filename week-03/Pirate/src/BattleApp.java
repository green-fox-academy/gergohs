public class BattleApp {
    Ship ship;
    Ship ship2;

    public BattleApp() {

        ship = new Ship();
        ship.setName("Spitfire");
        ship.fillShip();
        ship.getInfo();

        ship2 = new Ship();
        ship2.setName("DarkEel");
        ship2.fillShip();
        ship2.getInfo();

        System.out.println(ship.name + ", " + ship2.name);

    }
    public void main(String[] args) {

        ship.getInfo();
        ship2.getInfo();

    }
}
/*
    new Ship("theSpitfire");
        Ship thePoisonGrail = new Ship();

        darkEel.fillShip();
        thePoisonGrail.fillShip(new Pirate());

        darkEel.battle(thePoisonGrail);

        darkEel.getInfo();
        thePoisonGrail.getInfo();
*/

