package Animals;

import AnimalShelter.Animals.Cat;
import AnimalShelter.Animals.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest
{
    private Cat cat;

    @Before
    public void TestInitialize()
    {
        this.cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");
    }

    @Test
    public void TestConstructor()
    {
        Assert.assertEquals("Ms. Meow", this.cat.getName());
        Assert.assertEquals(Gender.Female, this.cat.getGender());
        Assert.assertNull(this.cat.getReservedBy());
        Assert.assertEquals("Scratches couch", this.cat.getBadHabits());
    }

    @Test
    public void TestReservation()
    {
        Assert.assertNull(this.cat.getReservedBy());
        Assert.assertTrue(this.cat.Reserve("John Doe"));
        Assert.assertNotNull(this.cat.getReservedBy());
        Assert.assertEquals("John Doe", this.cat.getReservedBy().getName());
        Assert.assertFalse(this.cat.Reserve("Jane Doe"));
    }


   // @Test
  //  public void TestReservationTime()
   // {
        // TODO: Implement this when interfaces have been explained.
        // We don't yet test the reserved time because it used the current
        // system clock to determine the result. Therefore we cannot check
        // if the values are the same, since two consecutive calls to
        // DateTime.Now are very likely to give different results. There is
        // a way to account for this, but the solution will use interfaces:
        // a concept that is not yet discussed in class. To be implemented.
    //    Assert.Inconclusive("Implement this when interfaces have been explained");
  //  }
}
