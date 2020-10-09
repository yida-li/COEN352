package SortedLinkListByValue;



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
System.out.println("\nSize is :"+list.getSize());
	}
	
		// inserting  nodes in order 
		public void insert(int x) {
		Node node = new Node();
		node.value=x;
		
		if( head==null) {  // 1st node
		head=node;
		size++;   
		}
		else if(size==1) {   // for second value
			
			if(head.value > x) {  // in the case that head is bigger than the second value
				node.next= head;  // this node will point to the reference head node
				head=node;  // head is the current node now, but it's ok because the current node is still pointing to the old head
			}
			else {       // if second value is bigger, then just stick it behind
				head.next=node;
			}
			size++;      
		}
		
		else { // third,fourth,fifth,... values
			Node n=head;
			while(n.next!=null) {
				
				if(n.value>x) {  // if head referenced node is bigger than the node
					node.next=n;  // node will point to head referenced node
					node=n;  // node is the head referenced node
				}
				else if(n.value<x && n.next.value>x) { // if the node must be inserted in between 2 nodes,
					node.next=n.next;
					n.next=node;
					break; // ok it means the loop is exited .. goes directly to size now hopefully
					
				}
				
				
				n=n.next;
			}
			n.next= node;
			size++;
		}
	}
	
	public int getSize() { // simple method to get the size of the linked list
		return size;
	}
		
	
	
	
	
	
	
	
	
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------------------------------
	
	
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
				size--;
				return; // most plausible it returns the search function, therefore ultimately finishing the method right of the bat if this line is executed?
			}
			n=n.next;  // standard increment for while loop
		}
		
		
		System.out.println("Nothing found\n");
		
	}
	class Node{
		Node next;int value;}
	Node head;
	public void print() {Node n= head;while(n!=null) {System.out.print(n.value+"\n");n=n.next;}}
	
		
		int size; // keeping a track of how many nodes there are
			
		
	

}