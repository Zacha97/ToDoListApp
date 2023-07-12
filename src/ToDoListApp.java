import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ToDoListApp {
    private final ArrayList<Task> tasks;

    public ToDoListApp() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
    tasks.add(task);
    }

    public void editTask (Task taskToEdit){
        int index = tasks.indexOf(taskToEdit);
        if (index >= 0) {
            Task task = tasks.get(index);
        }
    }

    public void deleteTask(Task taskToDelete){
        int index = tasks.indexOf(taskToDelete);
        if( index >= 0){
            tasks.remove(index);
        }
    }

    public void displayTask(){
        for (Task task : tasks) {
            System.out.println("Task's name: " + task.getName());
            System.out.println("Task's ID: " + task.getId());
            System.out.println("Task's description: " + task.getDescription());
            System.out.println("Task's creation date: " + task.getCreation_date());
        }
    }

    public static void main(String[] args) {
        ToDoListApp toDoListApp = new ToDoListApp();

        //example added below
        Task task = new Task(1, "Zadanie 1.", "Opis zadania:", new Date());
        toDoListApp.addTask(task); // new Task(1, "Zadanie 1.", "Opis zadania:", new Date()

        //displaying tasks before edits
        toDoListApp.displayTask();

        //Edit
        task.setName("New task name");
        task.setDescription("New task description");

        //display after Edit
        toDoListApp.displayTask();

        //delete task
        toDoListApp.deleteTask(task);

        //display task after deletion
        toDoListApp.displayTask();
    }
}