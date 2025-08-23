import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        
        while (true) {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //consume newLine

            if (choice ==1) {
                System.out.print("Enter a Task: ");
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Task added!");
    
            } else if (choice == 2) {
                System.out.println("\nYour tasks:");
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet!");
                } else {
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                }
                
            } else if (choice == 3) {
                System.out.println("Enter task number to remove: ");
                int taskNum = scanner.nextInt();
                if (taskNum > 0 && taskNum <= tasks.size()){
                    tasks.remove(taskNum - 1);
                    System.out.println("Task removed!");
                } else {
                    System.out.println("Invalid Task Number! Try again.");
                }
                
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

}




    