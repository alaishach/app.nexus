package templates;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<CustomTask> templates;  // Store CustomTask objects

    public TaskManager() {
        templates = new ArrayList<>();
    }

    // Add a new task template
    public void addTaskTemplate(CustomTask task) {
        templates.add(task);  // Add the task to the list
    }

    // Remove a task template by name
    public void removeTaskTemplate(String templateName) {
        templates.removeIf(template -> template.getName().equals(templateName));  // Corrected to remove from templates list
    }

    // List all task templates
    public List<CustomTask> listAllTaskTemplates() {
        return templates;  // Return the list of task templates
    }

    // Find task template by name
    public CustomTask findTaskTemplate(String taskName) {
        for (CustomTask task : templates) {  // Loop through the templates list
            if (task.getName().equals(taskName)) {
                return task;  // Return the task when found
            }
        }
        return null;  // Return null if task not found
    }
}
