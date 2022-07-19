package SortedLinkListGenericValue;

class generic <Key,Value>{

   	// declaring object node
	 class Node{                       
		Node next;
		Key key;
		Value value;}
	Node header;
	int size;
	
	public void insert(Key k, Value v) { // insert the node as a linked list data structure, the noded entering the list is automatically sorted each time, thus giving us a sorted linked list
	
		
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
			
			n.next= node;}}
	
	public String printString() { // method to print the link of nodes with their value and key
		String answer="";
		Node n= header;
		while(n.next!=null) {
			answer+=(n.key+" " +n.value + "  \n");
			n=n.next;
		}
		answer+=(n.key+" " +n.value+"\n");
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
	
	public static void main(String args[]) {
		
	
	
			
		generic<String, Integer> list1= new generic<String, Integer>();  //first list
		//since ComparingList is a generic type,the references must be parameterized,
		//  	                               ,that parameter that are being referenced here should be labeled
		// 									   ,it is better programming practice if compiler knows which type of parameter(argument) im passing in
		//                                     ,so im adding a argument type
		//ComparingList list= new ComparingList(); instead of using this one.
		list1.insert("Pikachu", 450);
		list1.insert("Bulbasaur", 230);
		list1.insert("Mew", 999);
		list1.insert("Lugia", 2300);
		System.out.println(list1.printString());
		generic<String, Integer> list2= new generic<String, Integer>();  //first list
		//since ComparingList is a generic type,the references must be parameterized,
		//  	                               ,that parameter that are being referenced here should be labeled
		// 									   ,it is better programming practice if compiler knows which type of parameter(argument) im passing in
		//                                     ,so im adding a argument type
		//ComparingList list= new ComparingList(); instead of using this one.
		list2.insert("M", 4242);
		list2.insert("C", 222);
		list2.insert("T", 100);
		list2.insert("t", 1000);
		System.out.println(list2.printString());
	
		
		
	
	
		
		
		
	}
}