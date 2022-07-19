package SimpleLinkedList;


public class LinkList {

	Node head;
	Node tail;
	
public void insert(int data) {
		
		Node node= new Node();  // initialize 1 node
		node.data=data;         // this node object takes in the argument data
		node.next=null;         // obviously pointing to null
		if( head==null)head=node;    // clearly first head == null for first node
		
		
		else                  // 
		{
			Node n= head;   // temp node n is head;
			while(n.next!=null) {   //as long as n's next pointer is not null, go to the last element of list, because the last element of the list will contain null duh
				n=n.next;
			}
			n.next=node;  // now this last element's next is the node initialized from above....
		}
	}
public void print() {
	Node n= head;
	while(n.next!=null) {
		System.out.println(n.data);
	n=n.next;
	}
	System.out.println(n.data);
}
	
}
