package AnimalShelter.Animals;

import java.util.Date;

public class Dog extends Animal{

    private Date LastWalk;

    public Date getLastWalk() {
        return LastWalk;
    }

    public void setLastWalk(Date lastWalk) {
        LastWalk = lastWalk;
    }

    private boolean NeedsWalk;

    public boolean getNeedsWalk() {
        return ((new Date()).after(this.LastWalk));
    }

    public Dog(String name, Gender gender){
            super(name, gender);

        this.LastWalk = new Date();
    }

@Override
    public String toString()
    {
        return super.toString() +
                String.format(", last walk: %s", this.LastWalk);
    }
}
