package com.farm.management;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class FarmerRegistration {
    private static List<Farmer> farmers = new ArrayList<>(); // List to store registered farmers
    private ListView<String> farmerListView;
    private TextField nameField;
    private TextField idField;
    private Button registerButton; // Declare registerButton as an instance variable

    public FarmerRegistration() {
        initializeUI(); // Initialize the UI components
    }

    private void initializeUI() {
        farmerListView = new ListView<>();
        nameField = new TextField();
        nameField.setPromptText("Enter farmer name");
        idField = new TextField();
        idField.setPromptText("Enter farmer ID");

        // Initialize the register button
        registerButton = new Button("Register Farmer");
        registerButton.setOnAction(e -> registerFarmer());

        // Layout for the farmer registration
        VBox layout = new VBox(10);
        layout.getChildren().addAll(nameField, idField, registerButton, farmerListView);
    }

    private void registerFarmer() {
        String name = nameField.getText().trim();
        String id = idField.getText().trim();

        if (!name.isEmpty() && !id.isEmpty()) {
            Farmer farmer = new Farmer(name, id); // Create a new farmer
            farmers.add(farmer); // Add farmer to the list
            farmerListView.getItems().add(farmer.toString()); // Update the ListView
            nameField.clear(); // Clear input fields
            idField.clear();
            System.out.println("Farmer registered: " + farmer);
        } else {
            System.out.println("Please fill in all fields.");
        }
    }

    public static List<Farmer> getFarmers() {
        return farmers; // Returns the list of registered farmers
    }

    public VBox getView() {
        VBox layout = new VBox(10); // Create a new VBox for the view
        layout.getChildren().addAll(nameField, idField, registerButton, farmerListView); // Add UI elements
        return layout; // Return the VBox layout
    }
}
