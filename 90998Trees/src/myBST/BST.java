package myBST;

public class BST<Key extends Comparable<Key>, Value>
{
	
	public static void main(String Args[]) {
		BST<String, Integer> bst = new BST<String, Integer>();
		System.out.println("Basic comparable BST:");
		bst.put("A", 444);
		
		bst.put("C", 124);
		bst.put("Xx", 64);
		bst.put("TTT", 42);
		bst.put("M", 23);
		bst.put("B", 42);
		bst.put("Bb", 4922);
		bst.print();
		
		System.out.println(bst.get("B"));
	}
	
	
 private Node rootNode; // root of BST
 
 private class Node
 {
 private Key key; // key
 	private Value val; // associated value
 		private Node left, right; // links to subtrees
 			
 
 public Node(Key key, Value val) // constructor initialized with....
 { 
	 this.key = key;
     this.val = val; 
    
 }
 }
 

 
 
 public Value get(Key key)   // this method seems kind of suspicious
 { 
	 Node refNode= rootNode;
 
 
	 while( refNode!=null) {  // if im checking for key 452
		 int cmp = key.compareTo(refNode.key); // (452) - refNode = cmp 
		 if(cmp<0) {   // if refNode is bigger, go left branch
			 refNode=refNode.left;
		 }
		 if(cmp>0) { // obviously if refNode is smaller, go right branch
			 
			 refNode=refNode.right;
		 }
		 else
			 return refNode.val;
		 
	 }
 return null;
 
 
 }
 
 public void print() {
	 
	
	 print(rootNode);
 }
 public void print(Node x) {
	 
	  Node yoda = x;	// this is a reference node to the rootnode that will be deleted at the end of the method anyways
	 
	 if( yoda!=null) {
		 
		 System.out.println(yoda.key+" "/*+yoda.val*/);
		 print(yoda.left);
		 print(yoda.right);
		 
	 }
 }
 
 

 public void put(Key key, Value val)
 { // Search for key. Update value if found; grow table if new.
  rootNode = put(rootNode, key, val);
 }
 private Node put(Node x, Key key, Value val)
 {
  // Change key’s value to val if key in subtree rooted at x.
  // Otherwise, add new node to subtree associating key with val.
  if (x == null) return new Node(key, val);
  int cmp = key.compareTo(x.key);
  
  //important part----------------------------------------------------------------
  
  if (cmp < 0)
	  x.left = put(x.left, key, val);
  else if (cmp > 0)
	  x.right = put(x.right, key, val);
  else
	  x.val = val;
  
//important part----------------------------------------------------------------
  
  
  return x;
 }
}