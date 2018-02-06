package AnimalShelter.Animals;

import java.util.Date;

public class Reservor
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

    private Date ReservedAt;

    public Date getReservedAt()
    {
        return ReservedAt;
    }
    public void setReservedAt(Date value)
    {
        ReservedAt = value;
    }

    public Reservor(String name, Date reservedAt)
    {
        this.Name = name;
        this.ReservedAt = reservedAt;
    }
}
