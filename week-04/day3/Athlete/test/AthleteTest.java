import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AthleteTest {

  private Athlete testAthlete;


  private Athlete a;

  @Before
  public void createAthlete (){
      a = new Athlete("U.Bolt", 30,40,10);
  }

    @Test
    public void goToGym() {
   a.goToGym();
   assertEquals(33, a.getStrength());
    }

    @Test
    public void goToRun() {
      a.goToRun();
      assertEquals(42,a.getStamina());
    }

    @Test
    public void eatHamburger() {
      a.eatHamburger();
      assertEquals(15, a.getHunger());
    }
}