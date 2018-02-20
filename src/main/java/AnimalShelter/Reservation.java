package AnimalShelter;

import AnimalShelter.Animals.Animal;
import AnimalShelter.Animals.Cat;
import AnimalShelter.Animals.Dog;
import AnimalShelter.Animals.Gender;

import java.util.ArrayList;

public class Reservation
{
    private ArrayList<Animal> Animals = new ArrayList<Animal>();

    public ArrayList<Animal> getAnimals() {
        return Animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        Animals = animals;
    }

    public void NewCat(String name, Gender gender, String badHabits)
    {
        this.Animals.add(new Cat(name, gender, badHabits));
    }

    public void NewDog(String name, Gender gender)
    {
        this.Animals.add(new Dog(name, gender));
    }

}
