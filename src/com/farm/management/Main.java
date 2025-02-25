package com.farm.management;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Agriculture Management System");

        // Farmer Registration Tab
        FarmerRegistration farmerRegistration = new FarmerRegistration();
        Tab registrationTab = new Tab("Farmer Registration");
        registrationTab.setContent(farmerRegistration.getView());

        // Real-Time Data Tab
        RealTimeData realTimeData = new RealTimeData();
        Tab dataTab = new Tab("Real-Time Data");
        dataTab.setContent(realTimeData.getView());

        // Resource Management & Distribution Tab
        Resource resource = new Resource();
        Tab resourceTab = new Tab("Resource Management");
        resourceTab.setContent(resource.getView());

        // Communication System Tab
        CommunicationSystem communicationSystem = new CommunicationSystem();
        Tab communicationTab = new Tab("Communication");
        communicationTab.setContent(communicationSystem.getView());

        // Report Tab to display all registered farmers
        Report report = new Report();
        Tab reportTab = new Tab("Farmer Report");
        reportTab.setContent(report.getView());
        
        // Refresh the report when the tab is selected
        reportTab.setOnSelectionChanged(event -> {
            if (reportTab.isSelected()) {
                report.updateFarmerReports(); // Refresh the farmer report
            }
        });

        // TabPane to hold all tabs
        TabPane tabPane = new TabPane();
        tabPane.getTabs().addAll(registrationTab, dataTab, resourceTab, communicationTab, reportTab);

        // Set the TabPane as the root layout of the scene
        VBox root = new VBox(tabPane);
        Scene scene = new Scene(root, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
