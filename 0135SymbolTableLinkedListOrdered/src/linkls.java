
class linkls <Key,Value>{

	
	
	static public void main(String Args[]) {
		
		linkls <String, Integer>ls= new linkls<String, Integer>();
		ls.insert("A", 23);
		ls.insert("D", 24);
		ls.insert("C", 2);
		ls.insert("B", 44);
		ls.insert("M",5242);
		ls.insert("E", 12);
		ls.insert("R", 44);
		ls.insert("Q", 21);
		ls.insert("A", 11);
		System.out.println(ls.printString());
		System.out.println("Total size : "+ls.size);
		
		
	}
		   	// declaring object node
			 class Node{                       
				Node next;
				Key key;
				Value value;}
			Node header;
			int size;
			
			public void insert(Key k, Value v) { // insert the node as a linked list data structure, the noded entering the list is automatically sorted each time, thus giving us a sorted linked list
				
				
				
				for (Node x = header; x != null; x = x.next) {//check for duplicates
			            if (k.equals(x.key)) {
			                x.value = v;
			                return;
			            }
			          }
				
				Node node= new Node();
				node.key=k;
				node.value=v;
				if( header==null) {
					header=node;
					size++;
				}
				else if(size==1) {
					
					if(compare(header.key,k)>0) {
						node.next= header;
						header=node;
					}
					else {
						header.next=node;
					}
					size++;
				}
				else {
					Node n = header;
					while(n.next!=null) {
						if(compare(n.key,k)>0) {
							node.next= n;
							node=n;
						}
						else if(compare(n.key,k)<0 && compare(n.next.key,k)>0 ) {
							node.next=n.next;
							n.next= node;
							break;
						}
						
						
					n=n.next;	
					}
					size++;
					n.next= node;}}
			
			public String printString() { // method to print the link of nodes with their value and key
				String answer="";
				Node n= header;
				while(n.next!=null) {
					answer+=(n.key+"" +n.value + "  ");
					n=n.next;
				}
				answer+=(n.key+"" +n.value);
				return answer;
			}
			public String remove(Key k) {  // a string method that returns the list of nodes with their value and key after removing 1 Key
				Node n = header;
				if(((String) n.key).compareTo((String) k)==0) {
					header=header.next;
				}
				while(n.next!=null) {
					if(((String) n.next.key).compareTo((String) k)==0) {
						n.next= n.next.next;
					}
					if(n.next!=null)
						n=n.next;
						}
				return printString();
			}
			public String Search(Key k) { // a method that searches for the for the key given, and returns the it's associated value if there is. If not, then return null
				String answer="";
				Node n = header; // i still need to familiarize myself with node referencing
				while(n.next!=null) {
					if(((String) n.key).compareTo((String) k)==0) {
						answer += "Value associated with the Key "+k+" is :"+n.value;
					}
					n=n.next;
				}
				if(((String) n.key).compareTo((String) k)==0) {
					answer += "Value associated with the Key "+k+" is :"+n.value;
				}
				if(answer=="")
				return "Key not found";
				else
				return answer;
			
			}
				
				
			
			public int compare(Key k, Key k1) {  //the method that compares the two objects and return an integer cmp. in the format of compare(x,y) ->>   value= x-y.
				
				int cmp = ((String) k).compareTo((String) k1);  //k-k1=? what number
				return cmp;// return the -/+ number.
			}
	   }
