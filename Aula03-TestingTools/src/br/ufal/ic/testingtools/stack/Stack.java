package br.ufal.ic.testingtools.stack;

import java.util.LinkedList;

public class Stack<E> {
	
	private int stackSize;
	
	private LinkedList<E> structure = new LinkedList<E>();
	
	public Stack(int size) {
		this.stackSize = size;
	}
	
	public int size() {
		return structure.size();
	}
	
	public boolean empty() {
		return (structure.size() == 0);
	}
	
	public E pop() {
		E element = peek();
		this.structure.removeFirst();
		return element;
	}
	
	public void push(E element) {
		if (this.structure.size() < this.stackSize) {
			this.structure.addFirst(element);
		} else {
			throw new OverFlowStackException("Overflow");
		}
	}
	
	public E peek() {
		if (!empty()) {
			return this.structure.peek();
		}
		
		throw new UnderflowStackException("Underflow");
	}
	
}