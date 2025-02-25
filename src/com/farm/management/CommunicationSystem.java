package com.farm.management;

import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CommunicationSystem {
    private ListView<String> messageListView;
    private TextField messageInput;
    private Button sendButton;

    public CommunicationSystem() {
        initializeUI(); // Initialize the UI components
    }

    private void initializeUI() {
        messageListView = new ListView<>();
        messageInput = new TextField();
        messageInput.setPromptText("Enter your message");

        // Initialize the send button
        sendButton = new Button("Send Message");
        sendButton.setOnAction(e -> sendMessage());

        // Layout for the communication system
        VBox layout = new VBox(10);
        layout.getChildren().addAll(messageInput, sendButton, messageListView);
    }

    private void sendMessage() {
        String message = messageInput.getText().trim();
        if (!message.isEmpty()) {
            messageListView.getItems().add(message); // Add message to the list
            messageInput.clear(); // Clear input field
        }
    }

    public VBox getView() {
        VBox layout = new VBox(10); // Create a new VBox for the view
        layout.getChildren().addAll(messageInput, sendButton, messageListView); // Add UI elements
        return layout; // Return the VBox layout
    }
}
