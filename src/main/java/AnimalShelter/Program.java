package AnimalShelter;
import AnimalShelter.Animals.Animal;
import AnimalShelter.Animals.Gender;

import java.util.ArrayList;

public class Program {


    public static void main(String [] args)
    {
        Reservation reservation = new Reservation();
        reservation.NewCat("Fikkie", Gender.Male,"Is Fat");
        ArrayList<Animal> temp = reservation.getAnimals();
        for (Animal animal: temp){
            System.out.println("Animal Shelter:");
            System.out.println("Animal:");
            System.out.println(animal.getName());
            String gender = animal.getGender().toString();
            System.out.println(gender);
        }
    }
}
