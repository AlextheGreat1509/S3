import AnimalShelter.Animals.Animal;
import AnimalShelter.Animals.Cat;
import AnimalShelter.Animals.Dog;
import AnimalShelter.Animals.Gender;
import AnimalShelter.Reservation;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Frontend extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
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
        });

        final ComboBox comboBox = new ComboBox();
        comboBox.getItems().addAll(
                "Cat", "Dog"
        );

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(comboBox);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
