package Homework;

import java.util.HashSet;
import java.util.Scanner;

public class SocialHandle {


    private HashSet<String> handleList = new HashSet<>();


    public String createHandle(String handle) {
        handle = handle.toLowerCase().trim();

        if (handle.length() > 9) {
            handle = handle.substring(0, 9);
        }

        return "@" + handle;
    }

    public void addHandle(String handle) {
        String newHandle = createHandle(handle);

        handleList.add(newHandle);
    }

    public void removeHandle(String handle) {
        String newHandle = createHandle(handle);

        handleList.remove(newHandle);
    }

    public HashSet<String> getHandles() {
        return handleList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SocialHandle socialHandle = new SocialHandle();

        while (true) {

            System.out.println("\n--- Social Media Handle System ---");
            System.out.println("1. Create and add a handle");
            System.out.println("2. Remove a handle");
            System.out.println("3. Display all handles");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your social media handle: ");
                    String handleToAdd = scanner.nextLine();
                    socialHandle.addHandle(handleToAdd);
                    System.out.println("Handle added successfully!");
                    break;

                case 2:
                    System.out.print("Enter the handle to remove: ");
                    String handleToRemove = scanner.nextLine();
                    socialHandle.removeHandle(handleToRemove);
                    System.out.println("Handle removed successfully!");
                    break;

                case 3:
                    System.out.println("\nCurrent handles:");
                    for (String handle : socialHandle.getHandles()) {
                        System.out.println(handle);
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
