package Week1.Day5;

import java.util.*;

public class W1_D5_1 {
    static class Document {
        int priority;
        int location;

        public Document(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int i = 0; i < a; i++) {
            int count = 0;
            int n = in.nextInt();
            int m = in.nextInt();
            in.nextLine();

            String input = in.nextLine();
            String[] splitInput = input.split(" ");
            Queue<Document> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

            for (int j = 0; j < splitInput.length; j++) {
                int priority = Integer.parseInt(splitInput[j]);
                queue.add(new Document(priority, j));
                priorityQueue.add(priority);
            }

            while (!queue.isEmpty()) {
                Document current = queue.poll();
                if (current.priority == priorityQueue.peek()) {
                    count++;
                    priorityQueue.poll();
                    if (current.location == m) {
                        break;
                    }
                } else {
                    queue.add(current);
                }
            }

            System.out.println(count);
        }
    }
}
