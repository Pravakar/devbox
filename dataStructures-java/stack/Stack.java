package stack;

public interface Stack <Item> extends Iterable<Item>{
	
	void push(Item item);
	Item pop();
	int size();
	boolean isEmpty();
}
