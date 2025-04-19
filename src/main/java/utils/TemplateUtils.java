package utils;

import templates.CustomTask;
import templates.TaskManager;

import java.util.List;

public class TemplateUtils {

    // Validates if a task template is valid (basic checks)
    public static boolean isValidTaskTemplate(CustomTask task) {
        return task.getName() != null && !task.getName().isEmpty() &&
                task.getDescription() != null && !task.getDescription().isEmpty() &&
                task.getTaskItems() != null && !task.getTaskItems().isEmpty();
    }

    // Example method to format task for display (could be used for any task template)
    public static String formatTaskTemplateForDisplay(CustomTask task) {
        return "Task Template: " + task.getName() + "\n" +
                "Description: " + task.getDescription() + "\n" +
                "Due Date: " + task.getDueDate() + "\n" +
                "Priority: " + task.getPriority() + "\n" +
                "Subtasks: " + String.join(", ", task.getTaskItems());
    }

    // Example method to validate and add a task template to the TaskManager
    public static boolean addTaskTemplateToManager(TaskManager taskManager, CustomTask task) {
        if (isValidTaskTemplate(task)) {
            taskManager.addTaskTemplate(task);
            return true;
        }
        return false; // Return false if the task is not valid
    }

    // Example method to remove a task template by its name from TaskManager
    public static boolean removeTaskTemplateByName(TaskManager taskManager, String taskName) {
        CustomTask task = taskManager.findTaskTemplate(taskName);
        if (task != null) {
            taskManager.removeTaskTemplate(taskName);
            return true;
        }
        return false; // Return false if the task with the given name is not found
    }

    // Example method to list all task templates in the TaskManager
    public static String listAllTaskTemplates(TaskManager taskManager) {
        List<CustomTask> tasks = taskManager.listAllTaskTemplates();
        StringBuilder sb = new StringBuilder();
        for (CustomTask task : tasks) {
            sb.append(formatTaskTemplateForDisplay(task)).append("\n\n");
        }
        return sb.toString(); // Return a formatted string of all task templates
    }
}
