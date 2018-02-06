package AnimalShelter.Animals;

public class Cat extends Animal
        {
private String BadHabits;

            public String getBadHabits() {
                return BadHabits;
            }

            public void setBadHabits(String badHabits) {
                BadHabits = badHabits;
            }

            public Cat(String name, Gender gender, String badHabits)
            {
        super(name, gender);
        this.BadHabits = badHabits;
        }
@Override
public String ToString()
        {
        return super.ToString() +
        String.format(", bad habits: %s", this.BadHabits.toLowerCase());
        }
        }
