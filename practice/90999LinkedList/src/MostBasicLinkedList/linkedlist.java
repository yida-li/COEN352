package MostBasicLinkedList;

public class linkedlist {
	class Node{
		Node next;
		int value;
	}
		
	Node head; // object referencing
	public void insert(int x) {
		Node node = new Node();
		node.value=x;
		
		if( head==null)
		head=node; // head now has all the values node has, and head remains after the insert is done
		
		else {
			Node n=head; // now i would say since i did not initialize the actual object i.e Node node = new Node();
						 // it must be that this n is just simply a reference node that will be deleted after the completion 
						 // of this method.
			while(n.next!=null) {
				n=n.next;
			}
			n.next= node;
		}
	}
	
	public void print() {
		
		Node n= head; // once again just a reference node n that is referencing the head node
					  // referencing seems almost like cloning that node and deleteing this node after print... so cruel
		while(n.next!=null) {
			
			System.out.print(" "+n.value+" ");	
			n=n.next;
		}
		System.out.print(" "+n.value+" ");
	}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
linkedlist list = new linkedlist();
list.insert(5);
list.insert(6);
list.insert(23);
list.insert(5222);
list.insert(898);
list.print();
	}

}
