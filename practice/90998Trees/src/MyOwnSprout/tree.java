package MyOwnSprout;

public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my first attempt ever at creating my own tree");
		System.out.println("It turns out, following my logic of how to build a tree, this is actually the implementation for BST itself, but just without the fancy comparable interface and Generic typess ");
		System.out.println("No, probably in 3 days");
		tree tr = new tree();

		tr.insert(24);
		tr.insert(522);
		tr.insert(84);
		tr.insert(92);
		tr.insert(122);
		tr.insert(9812);
		tr.insert(717);
		tr.insert(12);
		tr.insert(91);
		tr.insert(5);
		tr.insert(7);
		tr.insert(8);
		tr.insert(9);
		tr.insert(9);
		tr.insert(1);
		System.out.println("\nPrinting in order");
		tr.printLeftParentRight();
		System.out.println("\n");
		tr.printLEFTRIGHTPARENT();
		System.out.println("\n");
		tr.printParentLeftRight();
		
		
		
	}
		Node rootnode;
	
	public class Node{
		int key;
		Node left=null;
		Node right=null;
		Node parent=null;

	}
	
	
	/*public void printTest(Node n) {
		System.out.println(n.key);
		if(n!=null) {
			printTest(n.left);
			printTest(n.right);
			
		}
		
		
	}*/
	
	public void printLeftParentRight() {
		if (rootnode==null){
			System.out.println("go fuck urself");
		}
		else if(rootnode.right==null && rootnode.left==null) {
			System.out.println(rootnode.key);
		}
		else {
		printlpr(rootnode);
		}
	}				public void printlpr(Node n) { // printInOrder recursive method
		
		
		if(n!=null) {
			
			printlpr(n.left);
			System.out.println(n.key);
			printlpr(n.right);
			
		}
		
		
					}
	
	public void printParentLeftRight() {
		if (rootnode==null){
			System.out.println("go fuck urself");
		}
		else if(rootnode.right==null && rootnode.left==null) {
			System.out.println(rootnode.key);
		}
		else {
		printplr(rootnode);
		}
	}				public void printplr(Node n) { // printInOrder recursive method
		
		
		if(n!=null) {
			System.out.println(n.key);
			printplr(n.left);
			
			printplr(n.right);
			
		}
		
		
					}
	
	
	public void printLEFTRIGHTPARENT() {
		if (rootnode==null){
			System.out.println("go fuck urself");
		}
		else if(rootnode.right==null && rootnode.left==null) {
			System.out.println(rootnode.key);
		}
		else {
		printrtp(rootnode);
		}
	}				public void printrtp(Node n) { // printInOrder recursive method
		
		
		if(n!=null) {
			
			printrtp(n.left);
			
			printrtp(n.right);
			System.out.println(n.key);
		}
		
		
					}
	
	
	
	
	
	
	
	public void insert(int x) {
		
		Node node= new Node();     // initialize a new node with the value x
		node.key=x;
		if(rootnode==null) {    // if list is empty, node = root
			rootnode=node;
		}
		else {                  // or list has at least 1 node, go here      >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			Node refNode = rootnode; 
			
			if(node.key <= refNode.key ) {   // if the node going on the left side-------------------
				
				if( refNode.left==null) {
					refNode.left=node;
					node.parent=refNode;
					return;				// easiest possibility
				}
					
				else {
					refNode=refNode.left;
					Node signal=null;
					while(refNode!=null) {
						signal=refNode;
						if (x<=refNode.key) {
							refNode= refNode.left;
						}
						else {
							refNode=refNode.right;
						}
						
						
					}
					node.parent=signal;
							if(node.key<=signal.key) {
								signal.left=node;
							}
							else {
								signal.right=node;
							}
					
					}
				
			}
				else {                        //if the node is going on the right side------------------
					if( refNode.right==null) {
						refNode.right=node;
						node.parent=refNode;
						return;				// easiest possibility
					}else {
						refNode=refNode.right;
						Node signal=null;
						while(refNode!=null) {
							signal=refNode;
							if (x<=refNode.key) {
								refNode= refNode.left;
							}
							else {
								refNode=refNode.right;
							}
							
							
						}
						node.parent=signal;
								if(node.key<=signal.key) {
									signal.left=node;
								}
								else {
									signal.right=node;
								}
						
						}
					
					
					
				
					
					
					
					
					
					
					
					
				}
				
				
				
				
			}//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
			
			
		}
		
	}
	
	
	
	


