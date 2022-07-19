

public class ST<Key,Value> { // generic variables

	public int n;  // number of key-value pairs
	public Node topheader;  // could be head...
	
	public class Node{
		  	Key key;
	        Value value;
	        Node next;

	        public Node(Key key, Value value, Node next)  { // default constructor
	            this.key   = key;
	            this.value = value;
	            this.next  = next;
	        }
	}
	
	public void put(Key key, Value val) { // inserted in the format of a stack , topheader always equal to the last inserted node
	
		
		 for (Node x = topheader; x != null; x = x.next) {
	            if (key.equals(x.key)) {
	                x.value = val;
	                return;
	            }
	          }
		
		 
		 	
	    topheader = new Node(key, val, topheader);
		 n++;
		
	}
	public void print() {
		System.out.println("\nPrinting the symbol table");
		Node n= topheader;
		while(n.next!=null) {
			System.out.println(n.key+" "+ n.value);
			n= n.next;
		}
		System.out.println(n.key+" "+ n.value+"\n");
	}
	
	public Value get(Key key) {
		 for (Node x = topheader; x != null; x = x.next) {
	            if (key.equals(x.key)) return x.value;
	        }
	        return null;     // not found
	}
	public boolean contains(Key key) {
		for (Node x = topheader; x != null; x = x.next)
            if (key.equals(x.key)) 
            	return true;
        	//else
			return false;
	}
	public boolean isEmpty() {
		return false;
	}
	public void delete(Key key) {
		put(key,null);     // put the value associated with the key to null, java allows null value
	}
	public void anotherDelete(Key key) {
		if(topheader.key==key) {
			topheader=topheader.next;
		}
		
		for (Node x = topheader; x.next != null; x = x.next) {
			if(x.next.key==key) {
				x.next= x.next.next;
			}
			
		}
		
	}
	
	public int size() {
		return n;
	}
	
	Iterable<Key> keys(){
		return null;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ST<String, Integer> st = new ST<String, Integer>();
		st.put("A-", 23);
		st.put("B", 45);
		st.put("C", 15);
		st.put("D", 85);
		st.put("C", 222); // replaces 15
		st.put("B+", 75);
		st.print();
		System.out.println("Does the table contain the key D : "+st.contains("D"));
		System.out.println("Getting the value associated with the key D : "+st.get("D"));
		System.out.println("Is the symbol table empty? : " +st.isEmpty());
		System.out.println("The size of the symbol table is : " +st.size());
		System.out.println("Deleting the value associated with Key C");
		st.delete("C");
		st.print();
		System.out.println("Deleting the Key B+ itself");
		st.anotherDelete("B+");
		st.print();
		/* ST<String, Integer> st;
		 st = new ST<String, Integer>();
		 for (int i = 0; !StdIn.isEmpty(); i++)
		 {
		 String key = StdIn.readString();
		 st.put(key, i);
		 }
		 for (String s : st.keys())
		 StdOut.println(s + " " + st.get(s));
*/
	}

}