package com.farm.management;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class RealTimeData {
    public VBox getView() {
        VBox layout = new VBox(10);
        
        // Sample content for Real-Time Data
        Label weatherLabel = new Label("Weather Data: Sunny, 25°C");
        Label marketPricesLabel = new Label("Market Prices: Wheat - $200/ton");
        
        layout.getChildren().addAll(weatherLabel, marketPricesLabel);
        
        return layout; // Return the layout to be displayed in the tab
    }
}
