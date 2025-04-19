package app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Arrays;

import templates.CustomTask;
import templates.TaskManager;
import utils.TemplateUtils;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Set up the TaskManager and TemplateUtils
        TaskManager taskManager = new TaskManager();

        // Create some sample tasks
        CustomTask task1 = new CustomTask("Grocery List", "Buy groceries", Arrays.asList("Milk", "Eggs", "Bread"), "2025-04-19", "High");
        CustomTask task2 = new CustomTask("Homework", "Finish math assignment", Arrays.asList("Chapter 5", "Chapter 6", "Chapter 7"), "2025-04-20", "Medium");

        // Add tasks using TemplateUtils
        TemplateUtils.addTaskTemplateToManager(taskManager, task1);
        TemplateUtils.addTaskTemplateToManager(taskManager, task2);

        // Set up the UI components
        Label label = new Label("Let's manage your tasks");

        // Button to show all tasks
        Button showTasksButton = new Button("Show Task Templates");
        showTasksButton.setOnAction(e -> {
            // Show all task templates in the console (this can be displayed on the UI instead)
            String tasks = TemplateUtils.listAllTaskTemplates(taskManager);
            System.out.println(tasks);
        });

        // Button to add a new task
        Button addTaskButton = new Button("Add New Task");
        addTaskButton.setOnAction(e -> {
            CustomTask newTask = new CustomTask("Chores", "Do household chores", Arrays.asList("Clean the house", "Laundry"), "2025-04-21", "Low");
            TemplateUtils.addTaskTemplateToManager(taskManager, newTask);
            System.out.println("New task added!");
        });

        // Button to remove a task by name
        Button removeTaskButton = new Button("Remove Task by Name");
        removeTaskButton.setOnAction(e -> {
            TemplateUtils.removeTaskTemplateByName(taskManager, "Homework");
            System.out.println("Task removed!");
        });

        // Set up the layout
        VBox root = new VBox(10, label, showTasksButton, addTaskButton, removeTaskButton);
        root.setStyle("-fx-padding: 20;");

        // Create the Scene and Stage
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Nexus by alaishach");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
