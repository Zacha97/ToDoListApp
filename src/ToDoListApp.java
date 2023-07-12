import java.util.ArrayList;
public class ToDoListApp {
    private ArrayList<Task> tasks;

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
}