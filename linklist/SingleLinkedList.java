package com.ds.linklist;

/**
 * Single Linked list class data structure is dynamic in nature used for non linear data
 * @author kunaldey14
 *
 * @param <T>
 */
public class SingleLinkedList<T> {
	
	Node<T> head;
	
	/**
	 * Insert new Node at the beginning of the list
	 * @param new_data - Any Generic Data
	 */
	public void push(T new_data){
		Node<T> new_node = new Node<T>(new_data);
		new_node = head.next;
		head = new_node;
	}
	
	/**
	 * Add new Node at the end of the list
	 * @param new_data- Any Generic Data
	 */
	public void append(T new_data){
		Node<T> new_node = new Node<T>(new_data);
		if(head==null){
			head = new_node;
			return;
		}
		Node<T> last = head;
		while(last.next!=null){
			last = last.next;
		}
		last.next = new_node;
	}
	
	/**
	 * Print all the values in the list
	 */
	public void printList(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		Node<T> traveller_node = head;
		while(traveller_node!=null){
			System.out.print(traveller_node.data);
			traveller_node = traveller_node.next;
			if(traveller_node!=null)
				System.out.print("-->");
		}
	}
	
	public void reverseList(){
		Node<T> prev = null;
		Node<T> current = head;
		Node<T> next = null;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void main(String[] args) {
		SingleLinkedList<String> strList = new SingleLinkedList<>();
		strList.append("Java");
		strList.append("Ruby");
		strList.append("Python");
		strList.append("Go");
		
		strList.printList();
		System.out.println("");
		strList.reverseList();
		strList.printList();
		System.out.println("");
		SingleLinkedList<Integer> intgrList = new SingleLinkedList<>();
		intgrList.append(10);
		intgrList.append(20);
		intgrList.append(30);
		intgrList.append(40);
		
		intgrList.printList();
		System.out.println("");
		intgrList.reverseList();
		intgrList.printList();

	}

}
