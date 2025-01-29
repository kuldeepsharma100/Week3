package circularlinkedlist.taskschedular;

public class TaskSchedularMain {
    public static void main(String[] args) {
        TaskScheduler sc = new TaskScheduler();

        sc.addTaskAtBeginning(1, "Task 1", 1, "2025-01-30");
        sc.addTaskAtEnd(2, "Task 2", 2, "2025-02-05");
        sc.addTaskAtPosition(3, "Task 3", 3, "2025-02-10", 2);

        System.out.println("All Tasks:");
        sc.displayAllTasks();

        sc.viewAndMoveToNext();

        System.out.println("All Tasks after viewing current:");
        sc.displayAllTasks();

        sc.removeTaskById(2);

        System.out.println("All Tasks after removing Task 2:");
        sc.displayAllTasks();

        System.out.println("Search by Priority 3:");
        sc.searchByPriority(3);
    }
}
