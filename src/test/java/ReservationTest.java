import AnimalShelter.Animals.Gender;
import AnimalShelter.Reservation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReservationTest
{
    private Reservation reservation;

    @Before
    public void TestInitialize()
    {
        this.reservation = new Reservation();
    }

    @Test
    public void TestNewCat()
    {
        Assert.assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewCat("Ms. Meow", Gender.Female, "Scratches couch");
        Assert.assertEquals(1, this.reservation.Animals.size());
    }

    @Test
    public void TestNewDog()
    {
        Assert.assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewDog("Sgt. Woof", Gender.Male);
        Assert.assertEquals(1, this.reservation.Animals.size());
    }
}