package AnimalShelter.Animals;

import java.util.Date;

public class Dog {

    private Date LastWalk;

    public Date getLastWalk() {
        return LastWalk;
    }

    public void setLastWalk(Date lastWalk) {
        LastWalk = lastWalk;
    }

    private boolean NeedsWalk;

    public boolean isNeedsWalk() {
        return (new Date() - this.LastWalk).Days > 0;
    }

    public Dog(String name, Gender gender){
            super(name, gender)

        this.LastWalk = DateTime.Today;
    }

@Override
    public String ToString()
    {
        return super.ToString() +
                $", last walk: {this.LastWalk.ToShortDateString()}";
    }
}
