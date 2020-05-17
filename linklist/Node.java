package com.ds.linklist;

public class Node<T> {
	Node<T> next;
	T data;
	Node(T d){
		data = d;
		next = null;
	}

}
