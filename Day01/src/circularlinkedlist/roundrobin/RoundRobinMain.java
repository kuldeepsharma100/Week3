package circularlinkedlist.roundrobin;

public class RoundRobinMain {
    public static void main(String[] args) {
        RoundRobin list = new RoundRobin();

        list.addProcess(1, 10, 1);
        list.addProcess(2, 5, 2);
        list.addProcess(3, 8, 3);

        list.displayList();

        list.roundRobinScheduling(4);
    }
}