package SymbolTableList;
public class linklist {
	
Node head;
		
void insert(int x,String b) {
			
			Node node= new Node();
			node.value=x;
			node.t=b;
			if( head==null) {
				head=node;
			}
			else {
				
				Node n= head;
				while(n.next!=null) {
					n=n.next;
				}
				n.next= node;
			}
}
	
		int compare(String t,String b) {
			
			int cmp= t.compareTo(b); // if t > b then cmp is positive
			return cmp;
		}
		
		
		void sort() {
			

			
		
		
		
		
	}
		
		
		
			
			
			
		
		String search(String x) {
			Node n=head;
			String answer=" ";
			while(n.next!=null) {
				if( n.t==x) {
					answer+=n.value;
				
				}
				n=n.next;
			}
			if(n.t==x) {
				answer =" "+n.value;
			}
			
			if(answer==" ")
				return "Not found";
				else
			return answer;
		}
		void remove(String x) {
			
		
			Node n=head;
			if(n.t==x) {
				head=head.next;}
			
			while(n.next!=null) {
			if(n.next.t==x) {  
				n.next=n.next.next;   // in the case where n is before last, and the last element is to be removed, since n.next.next== null, it would mean n.next=>null
			}
			if(n.next!=null)
			n=n.next;
			}
			
			
			
			
		}
		String printString() {
			Node n= head;
			String answer ="";
			while(n.next!=null) {
				answer+= n.t+"/";
				answer+=n.value+ " ";
				n=n.next;
			}
			answer+= n.t+"/";
			answer+=n.value+ " ";
			return answer;
		}
		void print() {
			Node n= head;
			while(n.next!=null) {
				System.out.print(n.t+" ");
				System.out.println(n.value);
				n=n.next;
			}
			System.out.print(n.t+" ");
			System.out.println(n.value);
		}
	}

