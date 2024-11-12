import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the To-Do List App!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new task");
            System.out.println("2. Mark a task as completed");
            System.out.println("3. Display all tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(title, description);
                    toDoList.addTask(task);
                    break;

                case 2:
                    System.out.print("Enter task number to mark as completed: ");
                    int taskIndex = scanner.nextInt() - 1;
                    toDoList.markTaskAsCompleted(taskIndex);
                    break;

                case 3:
                    toDoList.displayTasks();
                    break;

                case 4:
                    System.out.println("Exiting the To-Do List App. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}