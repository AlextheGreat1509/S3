package AnimalShelter.Animals;

import java.util.Date;

public class Animal
{
    private String Name;

    public String getName()
    {
        return Name;
    }
    public void setName(String value)
    {
        Name = value;
    }
    private Gender Gender;

    public Gender getGender()
    {
        return Gender;
    }
    public void setGender(Gender value)
    {
        Gender = value;
    }
    private Reservor ReservedBy;

    public Reservor getReservedBy()
    {
        return ReservedBy;
    }
    public void setReservedBy(Reservor value)
    {
        ReservedBy = value;
    }

    public Animal(String name, Gender gender)
    {
        this.Name = name;
        this.Gender = gender;
    }

    public boolean Reserve(String reservedBy)
    {
        if (this.ReservedBy == null)
        {
            this.ReservedBy = new Reservor(reservedBy, new Date());
            return true;
        }
        return false;
    }

    public String ToString()
{
    String reserved = "not reserved";
    if (this.ReservedBy != null)
    {
        reserved = String.format( "reserved by %s", this.ReservedBy.getName());
    }
    return String.format("%s %s %s", this.Name, this.Gender, reserved);
}
}
