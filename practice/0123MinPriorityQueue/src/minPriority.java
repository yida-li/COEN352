
import java.util.PriorityQueue;

public class minPriority {
    public static void main(String[] args) {
        // Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);
        numbers.add(100);
        numbers.add(1100);
        String min="";
        min= Integer.toString(numbers.peek());
        String deleteNaturalOrder=" ";
        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            deleteNaturalOrder += Integer.toString(numbers.remove());
            deleteNaturalOrder += " ";
        }
        System.out.println(deleteNaturalOrder+"\n"+ min);
    }
}