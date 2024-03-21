import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ToDoList {
    private Queue<String> tasks;

    public ToDoList() {
        tasks = new LinkedList<>();

    }

    public void addTask(String task) {
        tasks.offer(task);

        System.out.println("Task '" + task + "' added to the to-do list.");

    }

    public void completeTask() {
        if (!tasks.isEmpty()) {
            String completedTask = tasks.poll();

            System.out.println("Completed task: " + completedTask);

        } else {
            System.out.println("No tasks left to complete.");

        }
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {

            System.out.println("Task '" + task + "' has been removed.");

        } else {
            System.out.println("Task '" + task + "' not found in the to-do list.");

        }
    }

    public void showTasks() {
        if (!tasks.isEmpty()) {
            System.out.println("To-Do List:");
            int index = 1;
            for (String task : tasks) {
                System.out.println(index + ". " + task);
                index++;
            }
        } else {
            System.out.println("To-Do List is empty.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pekerjaan");
            System.out.println("2. Pekerjaan Selesai");
            System.out.println("3. Hapus Pekerjaan");
            System.out.println("4. Tampilkan Pekerjaan");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String taskToAdd = scanner.nextLine();
                    todo.addTask(taskToAdd);
                    break;
                case 2:
                    todo.completeTask();
                    break;
                case 3:
                    System.out.print("Enter the task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    todo.removeTask(taskToRemove);
                case 4:
                    todo.showTasks();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }
    }
}