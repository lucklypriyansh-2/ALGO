package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {

	int node;
	Node left = null;
	Node right = null;

	public Node(int value) {
		// TODO Auto-generated constructor stub
		this.node = node;
	}

}
public class ArrayToHeap {

	

public static void main(String... args)
{
	
	
	int [] array = new int[]{1,2,3,4,5,6};
	
	
	Node head=new Node(1);
	Queue<Node> queue = new LinkedList();
	queue.add(head);
	
int i=0;
	while (!queue.isEmpty())
	{
		Node currentnode=queue.remove();

		int left=2*i+1;
		int right=2*i+2;
		
		currentnode.left=left>array.length-1?null:new Node(array[left]);
		currentnode.right=right>array.length-1?null:new Node(array[right]);
		
		if(currentnode.left!=null)
			queue.add(currentnode.left);

		if(currentnode.right!=null)
			queue.add(currentnode.right);
		i++;
	}
	
	
	
}
}




