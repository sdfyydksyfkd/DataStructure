package section02.ArrayCircleQueue;

public interface Queue {
	boolean isEmpty();
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}