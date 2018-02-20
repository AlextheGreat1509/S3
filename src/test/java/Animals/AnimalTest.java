package Animals;
import AnimalShelter.Animals.Animal;
import AnimalShelter.Animals.Gender;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnimalTest {
    private Animal animal;

    @Before
    public void TestInitialize() {
        this.animal = new Animal("Ugly Duckling", Gender.Male);
    }

    @Test
    public void TestConstructor() {
        Assert.assertEquals("Ugly Duckling", this.animal.getName());
        Assert.assertEquals(Gender.Male, this.animal.getGender());
        Assert.assertNull(this.animal.getReservedBy());
    }

    @Test
    public void TestReservation() {
        Assert.assertNull(this.animal.getReservedBy());
        Assert.assertTrue(this.animal.Reserve("John Doe"));
        Assert.assertNotNull(this.animal.getReservedBy());
        Assert.assertEquals("John Doe", this.animal.getReservedBy().getName());
        Assert.assertFalse(this.animal.Reserve("Jane Doe"));
    }


    //@Test
    //public void TestReservationTime()
    //{
        // TODO: Implement this when interfaces have been explained.
        // We don't yet test the reserved time because it used the current
        // system clock to determine the result. Therefore we cannot check
        // if the values are the same, since two consecutive calls to
        // DateTime.Now are very likely to give different results. There is
        // a way to account for this, but the solution will use interfaces:
        // a concept that is not yet discussed in class. To be implemented.
        //Assert.Inconclusive("Implement this when interfaces have been explained");
   // }
}