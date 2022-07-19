package NotWithoutDeleteAndSearch;


public class linkedlist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
linkedlist list = new linkedlist();
list.insert(5);
list.insert(6);
list.insert(23);
list.insert(232);
list.insert(234);
list.insert(5222);
list.insert(898);

list.print();
list.search(40);
list.search(23);
list.delete(898);
list.print();
	}
	public void delete(int x) {
		//this one is tricky for 1 way links, because how are you going to connect the link backwards? the idea backwards needs more elaboration
		
		Node n= head; // reference node
		
		if(head==null)
			System.out.println(" go fuck urself\n");
		if(head.value==x) {
			head=null;
			System.out.println(" why would you delete your only value?\n"); // dont worry if you're not stupid, you wont ever get these results in the output
		
						  }
		while(n.next!=null) { // as long the value after the referencing node is not null  
			if(n.next.value==x) { // peak next value, if its wanted one, well... i'm gonna point to next.next 
				System.out.println("Congratulation, the value "+x+" is deleted\n");// but not really, that node is still somewhere in the ocean of memory but that ocean is going to recycle itself afterwards so it wouldn't really matter
				n.next=n.next.next;// the middle node's link is severed forever and thus gone
			}  // and if n.next.next is a null? doesn't matter i'll just point to null, because it means im the last element anyways
			if(n.next!=null) // because null doesn't have a next right? let alone being a node
			n=n.next; // this is the increment for while loop
			}
		}
		public void search(int x) {
			Node n= head; // another reference node thats gonna be deleted after this search method finish executing
		
			while(n!=null) {
				if(n.value==x) {
					System.out.println("Node found with the value :" + x+"\n");
					return; // most plausible it returns the search function, therefore ultimately finishing the method right of the bat if this line is executed?
					
				}
				n=n.next;  // standard increment for while loop
			}
			
			
			System.out.println("Nothing found\n");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//---------------------------------------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------------------------------------
		//---------------------------------------------------------------------------------------------------------------------------------------------------------
		
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
		while(n!=null) {
			
			System.out.print(n.value+"\n");	
			n=n.next; // wouldn't it be better this way if the reference node that is point to a null node, is says; "hey let me be that null node";
					  // essentially deleting itself, i'd say that saves some space
		}
			
	}
	
		
		
	

}
