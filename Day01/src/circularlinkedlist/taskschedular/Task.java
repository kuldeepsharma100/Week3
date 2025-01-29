package circularlinkedlist.taskschedular;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate; // Due date as a String
    Task next;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
