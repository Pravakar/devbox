package stack;

import java.util.Iterator;

public class StackImplementation <Item> implements Stack<Item>{
	
	private Node head;
	private int size;
	
	private class Node{
		Item item;
		Node next;
	}
	
	public StackImplementation(){
		head = null;
		size = 0;
	}
	
	@Override
	public void push(Item item) {
		
		Node oldhead = head;
		head = new Node();
		head.item = item;
		head.next = oldhead;
		size++;
		
	}

	@Override
	public Item pop() {
		Item item = head.item;
		head = head.next;
		size --;
		return item;
	}

	@Override
	public int size() {
		return size; 
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<Item>{
		
		private int i = size;
		private Node topNode = head;

		@Override
		public boolean hasNext() {
			return (i > 0);
		}

		@Override
		public Item next() {
			Item item = topNode.item;
			topNode = topNode.next;
			i--;
			return item;
		}
		
	}
	
	public static void main(String args[]){
		
		Stack<Integer> s = new StackImplementation<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		
		//System.out.println(s.size());
		
		for(Integer i : s){
			System.out.println(i);
		}
	}

	

}
