package ComparableLinkedList;



public class ComparingList <Key,Value>{

	public class Node{
		Node next;
		Key key;
		Value value;
		
	}
	Node header;
	int size;
	
	public void insert(Key k, Value v) { // the heavy weight 
	
		
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
			
			n.next= node;
		
		}
}
	public void print() {
		Node n= header;
		
		while(n.next!=null) {
			System.out.println(n.key+" " +n.value);
			n=n.next;
		}
		System.out.println(n.key+" " +n.value);
	}
	public String printString() {
		String answer="";
		Node n= header;
		while(n.next!=null) {
			answer+=(n.key+"" +n.value + "  ");
			n=n.next;
		}
		answer+=(n.key+" " +n.value);
		return answer;
	}
	public String remove(Key k) {
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
	public String Search(Key k) {
		String answer="";
		Node n = header; // keep in mind these are referencing/pointer manipulation
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
		
		
	
	public int compare(Key k, Key k1) {
		
		int cmp = ((String) k).compareTo((String) k1);
		return cmp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ComparingList<String, Integer> list= new ComparingList<String, Integer>();
		list.insert("S", 24);
		list.insert("B", 24);
		list.insert("C", 24);
		list.insert("D", 24);
		list.insert("W", 24);
		list.insert("K", 24);
		System.out.println(list.remove("D"));
		
		System.out.println(list.Search("V"));
		
	}

}
