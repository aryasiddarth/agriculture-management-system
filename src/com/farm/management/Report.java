package com.farm.management;

import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

import java.util.List;

public class Report {
    private ListView<String> farmerReportListView;

    public Report() {
        farmerReportListView = new ListView<>();
        updateFarmerReports(); // Load the farmer reports when instantiated
    }

    public void updateFarmerReports() {
        farmerReportListView.getItems().clear(); // Clear previous items
        List<Farmer> farmers = FarmerRegistration.getFarmers(); // Retrieve registered farmers

        for (Farmer farmer : farmers) {
            farmerReportListView.getItems().add(farmer.toString()); // Display each farmer's details
        }
    }

    public VBox getView() {
        VBox layout = new VBox(); // Create a new VBox for the view
        layout.getChildren().add(farmerReportListView); // Add the ListView to the layout
        return layout; // Return the VBox layout
    }
}
