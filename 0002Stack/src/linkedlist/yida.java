package linkedlist;

public class yida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A simple stack with linked list\n");
		yida sf= new yida();
		sf.push("Abedical");
		sf.push(" ");
		sf.push("Dadilion");
		sf.push("Helenium");
		sf.push("Canvas");
		System.out.println(sf.pop());
		
	}
private Node first; // automatically declared null anyways
		
		private class  Node{
			
			
			String item;
			Node next;
		}
		public boolean isEmpty() {
			return first==null;  // check if the first is null/ or if list is empty
		}
		public void push(String item) {
			
			Node od= first;
			first= new Node();
			first.item=item;
			first.next=od;
			
		}
		public String pop()
		{
			String item = first.item;
			first= first.next;
			return item;
		}
}
