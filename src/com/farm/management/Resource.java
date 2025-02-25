package com.farm.management;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Resource {
    public VBox getView() {
        VBox layout = new VBox(10);
        
        // Sample content for Resource Management
        Label resourcesLabel = new Label("Available Resources: Seeds, Fertilizers, Equipment");
        
        layout.getChildren().add(resourcesLabel);
        
        return layout; // Return the layout to be displayed in the tab
    }
}
