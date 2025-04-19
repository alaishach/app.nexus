package templates;

import java.util.List;

public class CustomTask {
    private String name;
    private String description;
    private List<String> taskItems; // List of individual tasks in the template
    private String dueDate; // Optional: A due date for the task template
    private String priority; // Optional: Priority (High, Medium, Low)

    // Constructor
    public CustomTask(String name, String description, List<String> taskItems, String dueDate, String priority) {
        this.name = name;
        this.description = description;
        this.taskItems = taskItems;
        this.dueDate = dueDate;
        this.priority = priority;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTaskItems() {
        return taskItems;
    }

    public void setTaskItems(List<String> taskItems) {
        this.taskItems = taskItems;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "CustomTask{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", taskItems=" + taskItems +
                ", dueDate='" + dueDate + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }
}
