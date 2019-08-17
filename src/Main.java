

public class Main
{
    private static final int SIZE = 10;

    public static void main(String[] args) {

        Queue queue = new Queue(SIZE);
        Deque deque = new Deque(SIZE);
        StringInverse inverse = new StringInverse();

        inverse.printStackToString(inverse.initializeStack());

        initializeQueue(queue);
        initializeDequeue(deque);


        while (!deque.isEmpty()) {
            System.out.println(deque.removeRight());
            System.out.println(deque.removeLeft());
        }
    }

    static void initializeDequeue(Deque deque) {
        for (int i = 0; i < SIZE/2; i++) {
            deque.insertLeft(i);
            deque.insertRight(i);
        }
    }

    static void initializeQueue(Queue queue) {
        for (int i = 0; i < SIZE; i++) {
            queue.insert(i);
        }
    }
}