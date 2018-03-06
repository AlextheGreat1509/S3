package AnimalShelter;

import AnimalShelter.Animals.Animal;
import AnimalShelter.Animals.Cat;
import AnimalShelter.Animals.Dog;
import AnimalShelter.Animals.Gender;
import AnimalShelter.Reservation;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Date;

public class Frontend extends Application {

    @Override
    public void start(Stage primaryStage) {

        final ListView<String> listViewAnimals = new ListView<String>();

        Label species = new Label("Species: ");
        final ComboBox comboBoxSpecies = new ComboBox();
        comboBoxSpecies.getItems().addAll(
                "Cat", "Dog"
        );

        Label name = new Label("Name: ");
        final TextField textFieldName = new TextField ();
        textFieldName.setPrefWidth(100);

        Label gender = new Label("Gender: ");

        final RadioButton genderMaleRB = new RadioButton("Male");
        final RadioButton genderFemaleRB = new RadioButton("Female");

        final ToggleGroup genderRB = new ToggleGroup();
        genderMaleRB.setToggleGroup(genderRB);
        genderFemaleRB.setToggleGroup(genderRB);
        genderMaleRB.setSelected(true);

        final HBox radioBox = new HBox(20, genderMaleRB, genderFemaleRB);

        Label badHabits = new Label("Bad Habits: ");
        final TextField textFieldbadHabits = new TextField ();
        textFieldbadHabits.setDisable(true);

        Button btnAnimal = new Button();

        btnAnimal.setText("Say 'Hello World'");
        btnAnimal.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                Reservation reservation = new Reservation();
                ObservableList<String> itemsAnimal = FXCollections.observableArrayList();

                if (comboBoxSpecies.getValue() == "Cat" ) {
                    if (genderRB.getSelectedToggle() == genderMaleRB) {
                        reservation.NewCat(textFieldName.getText(), Gender.Male, textFieldbadHabits.getText());
                    }
                    if(genderRB.getSelectedToggle() == genderFemaleRB){
                        reservation.NewCat(textFieldName.getText(), Gender.Female, textFieldbadHabits.getText());
                    }
                }
                else if(comboBoxSpecies.getValue() == "Dog") {
                    if (genderRB.getSelectedToggle() == genderMaleRB) {
                        reservation.NewDog(textFieldName.getText(), Gender.Male);
                    }
                    if (genderRB.getSelectedToggle() == genderFemaleRB) {
                        reservation.NewDog(textFieldName.getText(), Gender.Female);
                    }

                }

                ArrayList<Animal> temp = reservation.getAnimals();

                for (Animal animal : temp) {
                    String tempAnimal = animal.toString();
                    itemsAnimal.add(tempAnimal);
                    System.out.println(animal.ToString());
                }
                listViewAnimals.setItems(itemsAnimal);
            }
        });

        comboBoxSpecies.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                if (comboBoxSpecies.getValue() == "Cat" ) {
                    textFieldbadHabits.setDisable(false);
                }
                else {
                    textFieldbadHabits.setDisable(true);
                }
            }
        });

        VBox leftMenuBox = new VBox();
        leftMenuBox.getChildren().addAll(species, comboBoxSpecies, name, textFieldName, gender , radioBox, badHabits, textFieldbadHabits, btnAnimal);
        leftMenuBox.setAlignment(Pos.TOP_LEFT);
        leftMenuBox.setMaxSize(200,250);

        Label animals = new Label("Animals: ");
        listViewAnimals.setMinWidth(350);
        listViewAnimals.setMinHeight(120);

        VBox rightMenuBox = new VBox();
        rightMenuBox.getChildren().addAll(animals, listViewAnimals);
        rightMenuBox.setAlignment(Pos.TOP_LEFT);
        rightMenuBox.setMaxSize(400,250);

        HBox fullMenuBox = new HBox(30, leftMenuBox, rightMenuBox);

        StackPane root = new StackPane();
        root.getChildren().add(fullMenuBox);
        root.setAlignment(Pos.TOP_LEFT);


        Scene scene = new Scene(root, 600, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
