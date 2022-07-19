import java.util.Queue;

public class BinarySearchTree<Key extends Comparable<Key>, Value>
{
	
	public static void main(String Args[]) {
		
		
		
		// initializing the binary search tree class object, cast it to hold String type and Integer type as the 2 generic parameter
		BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();
		bst.put("E", 444);
		bst.put("D", 124);
		bst.put("A", 82);
		bst.put("Q", 82);
		bst.put("J", 4922);
		bst.put("M", 1522);
		bst.put("T", 822);
		bst.put("S", 6922);
		
	
		System.out.println("Floor (Q) =  "+bst.floor("Q"));
		System.out.println("Select (5) =  "+bst.select(5));
		System.out.println("Ceiling (Q) =  "+bst.Ceiling("Q"));
		System.out.println("Rank of (J) =  "+bst.rank("J"));
		
		
	}
	
	/* Need to ask Ta for this one..  basically does returns the keys in a given range "quote on quote".
	public Iterable<Key> keys()
	{ return keys(min(), max()); }
	public Iterable<Key> keys(Key lo, Key hi)
	{
	 Queue<Key> queue = new Queue<Key>();
	 keys(rootNode, queue, lo, hi);
	 return queue;
	}
	private void keys(Node x, Queue<Key> queue, Key lo, Key hi)
	{
	 if (x == null) return;
	 int cmplo = lo.compareTo(x.key);
	 int cmphi = hi.compareTo(x.key);
	 if (cmplo < 0) keys(x.left, queue, lo, hi);
	 if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key);
	 if	(cmphi > 0) keys(x.right, queue, lo, hi);
	}
	*/
	
 private Node rootNode; // root of BST ,header, the top of the pyramid,

 
 
 
 
 // retarded way to put a node 
 public void put(Key key, Value val)  
 { // Search for key. Update value if found; grow table if new.
  rootNode = put(rootNode, key, val);//every single time, i insert a node, a new root node is initialized with all the connections already made... talk about waste of space
 }
 private Node put(Node x, Key key, Value val)
 {
	 
  
  if (x == null)                  // for all entering nodes thaat are null
	  return new Node(key, val, 1);
  
  
  
  // Comparing 
  //--------------------------------------------------------
  int cmp = key.compareTo(x.key);
  if (cmp < 0) 
	  x.left = put(x.left, key, val);
  else if (cmp > 0) 
	  x.right = put(x.right, key, val);
  else 
	  x.val = val;
  
  //----------------------------------------------------------
  
  
  
  x.N = size(x.left) + size(x.right) + 1;
  
  
  // so it didn't matter what sort of autistic coding was done above, in a manner act sophisticated but it's not worth the time...
  
  // this shitty method would return x, what is x? well it is the very object that was inserted
  
  // this is the most shitty code i have ever seen.. the put(Node x, Key key, value val is pointless because its returning its original 
  
  
  // ok i refuse to code like this...
  
  return x;
 }
 


 
 public void YidaFancyTreePrint() {
	 // this is probably the only thing worth implementing at this point, when im cornered and have no more choice in life
	 
	
	
	 
	
	 
	 for(int i=0;i<4;i++) {
		 
		 for(int j=0;j<Exponent(i);j++) {
			 
			 
			 
		 }
		 
	 }
}
 public int Exponent(int x) {
	 int answer=0;
	 for(int i=0;i<x;i++)
		 answer=answer*2;
	 return answer;
			 
 }
 
 
 
 
 
 
 
 ////////////////////////////Print Style
 public void printInOrder() {
	 printLeftParentRight(rootNode);
 }
 public void printLeftParentRight(Node x) {
	 
 Node yoda = x;	// this is a reference node to the rootnode that will be deleted at the end of the method anyways
	 
	 if( yoda!=null) {
		 
		 
		 printLeftParentRight(yoda.left);
		 System.out.println(yoda.key+"         total nodes: "+yoda.N);
		 printLeftParentRight(yoda.right);
		 
	 }
 }
 public void printParentLeftRight() {
	 printPLR(rootNode);
 }
 public void printPLR(Node x) {
	 
 Node yoda = x;	// this is a reference node to the rootnode that will be deleted at the end of the method anyways
	 
	 if( yoda!=null) {
		 
		 System.out.println(yoda.key+" "+yoda.N);
		 printPLR(yoda.left);
		 
		 printPLR(yoda.right);
		 
	 }
 }public void printLeftRightParent() {
	 printLRP(rootNode);
 }
 public void printLRP(Node x) {
	 
 Node yoda = x;	// this is a reference node to the rootnode that will be deleted at the end of the method anyways
	 
	 if( yoda!=null) {
		 
		 
		 printLRP(yoda.left);
		 
		 printLRP(yoda.right);
		 System.out.println(yoda.key+" "+yoda.N);
	 }
 }
 
 
 
 
 ////// Node class
 private class Node
 {
 private Key key; // key
 	private Value val; // associated value
 		private Node left, right; // links to subtrees
 			private int N; // # nodes in subtree rooted here
 
 public Node(Key key, Value val, int N) // constructor initialized with....
 { 
	 this.key = key;
     this.val = val; 
     this.N = N; 
 }
 }
 ///////////////////////////////////////////////////////
 public int size()     // im guessing in this manner of structing the tree, the top node would essentially possess the high degree of N am i right?
 { return size(rootNode); }
 
 private int size(Node x) // pretty standard way to get the size
 {
 if (x == null) return 0;
 else return x.N;	
 }
 
 
 
 
 
 
 
 
 // Retarded way to get the value of the node....
 public Value get(Key key)   
 { return get(rootNode, key); }   
 
 private Value get(Node x, Key key)
 { // Return value associated with key in the subtree rooted at x;
  // return null if key not present in subtree rooted at x.
  if (x == null) return null;
  int cmp = key.compareTo(x.key);
  if (cmp < 0) return get(x.left, key);
  else if (cmp > 0) return get(x.right, key);
  else return x.val;
 }
 
 
 
 
 /////////////////////////// getting the rank/position
 public Key select(int k)
 {
  return select(rootNode, k).key;
 }
 private Node select(Node x, int k)
 { // Return Node containing key of rank k.
  if (x == null) return null;
  int t = size(x.left);
  if (t > k) return select(x.left, k);
  else if (t < k) return select(x.right, k-t-1);
  else return x;
 }
 public int rank(Key key)  // rank is basically getting the order of a single Key, kinda like printing from left to parent to right
 { return rank(key, rootNode); }
 private int rank(Key key, Node x)
 { 
  if (x == null) return 0;
  int cmp = key.compareTo(x.key);
  if (cmp < 0) return rank(key, x.left);
  else if (cmp > 0) return 1 + size(x.left) + rank(key, x.right);
  else return size(x.left);
 }
 
 ////////////////////////////////////////////////////////////////////////
 
 
 
 
 
 
 
 
 
 
 
 
 public Key max()    //find biggest est key element basically
 {
  return max(rootNode).key;
 }
 private Node max(Node x)
 {
  if (x.right == null) return x;
  return max(x.right);
 }
 public Key min()    //find smallest key element basically
 {
  return min(rootNode).key;
 }
 private Node min(Node x)
 {
  if (x.left == null) return x;
  return min(x.left);
 }
 
 
 public Key Ceiling(Key key) // a Key ( in the list) that is bigger or equal to the (key searched)
 {
  Node x = ceiling(rootNode, key);
  if (x == null) return null;
  return x.key;
 }
 private Node ceiling(Node x, Key key)
 {
  if (x == null) return null;
  int cmp = key.compareTo(x.key);
  if (cmp == 0) return x;
  if (cmp > 0) return ceiling(x.right, key);
  Node t = ceiling(x.left, key);
  if (t != null) return t;
  else return x;
 }
 public Key floor(Key key) // a Key ( in the list) that is smaller or equal to the (key searched)
 {
  Node x = floor(rootNode, key);
  if (x == null) return null;
  return x.key;
 }
 private Node floor(Node x, Key key)  // 
 {
  if (x == null) return null;
  int cmp = key.compareTo(x.key);
  if (cmp == 0) return x;
  if (cmp < 0) return floor(x.left, key);
  Node t = floor(x.right, key);
  if (t != null) return t;
  else return x;
 }
 
 
 
 
 // the rough and hard but last part below now
 
 
 
 
 
 public void deleteMax()
 {
  rootNode = deleteMax(rootNode);
 }
 private Node deleteMax(Node x)
 {
  if (x.right == null) return x.left;  // Let's say there the Parent node passed in has no left Node, then return the right obviously because the right because the parent is the one getting removed duh
  x.right = deleteMax(x.right);
  x.N = size(x.right) + size(x.left) + 1;
  return x;  //anyhow returns always the rootNode with the new size 
 }
 public void deleteMin()
 {
  rootNode = deleteMin(rootNode);
 }
 private Node deleteMin(Node x)
 {
  if (x.left == null) return x.right;  // Let's say there the Parent node passed in has no left Node, then return the right obviously because the right because the parent is the one getting removed duh
  x.left = deleteMin(x.left);
  x.N = size(x.left) + size(x.right) + 1;
  return x;  //anyhow returns always the rootNode with the new size 
 }
 
 
 public void delete(Key key)
 { rootNode = delete(rootNode, key); }
 private Node delete(Node x, Key key)
 {
  if (x == null) return null;
  int cmp = key.compareTo(x.key);
  if (cmp < 0) x.left = delete(x.left, key);
  else if (cmp > 0) x.right = delete(x.right, key);
  else // it would be a match(cmp=0)
  {
  if (x.right == null) return x.left;
  if (x.left == null) return x.right;
  Node t = x;
  x = min(t.right); // See page 407.
  x.right = deleteMin(t.right);
  x.left = t.left;
  }
  x.N = size(x.left) + size(x.right) + 1;
  return x;
 }
 
 

 
 
 
 
 
 
 

}