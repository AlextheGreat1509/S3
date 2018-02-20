package Animals;

import AnimalShelter.Animals.Dog;
import AnimalShelter.Animals.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class DogTest
{
    private Dog dog;

    @Before
    public void TestInitialize()
    {
        this.dog = new Dog("Sgt. Woof", Gender.Male);
    }

    @Test
    public void TestConstructor()
    {
        Assert.assertEquals("Sgt. Woof", this.dog.getName());
        Assert.assertEquals(Gender.Male, this.dog.getGender());
        Assert.assertNull(this.dog.getReservedBy());
        Assert.assertEquals(new Date(), this.dog.getLastWalk());
        Assert.assertFalse(this.dog.getNeedsWalk());
    }

    @Test
    public void TestReservation()
    {
        Assert.assertNull(this.dog.getReservedBy());
        Assert.assertTrue(this.dog.Reserve("John Doe"));
        Assert.assertNotNull(this.dog.getReservedBy());
        Assert.assertEquals("John Doe", this.dog.getReservedBy().getName());
        Assert.assertFalse(this.dog.Reserve("Jane Doe"));
    }


    //@Test
   // public void TestReservationTime()
    //{
        // TODO: Implement this when interfaces have been explained.
        // We don't yet test the reserved time because it used the current
        // system clock to determine the result. Therefore we cannot check
        // if the values are the same, since two consecutive calls to
        // DateTime.Now are very likely to give different results. There is
        // a way to account for this, but the solution will use interfaces:
        // a concept that is not yet discussed in class. To be implemented.
    //    Assert.Inconclusive("Implement this when interfaces have been explained");
   // }
}
