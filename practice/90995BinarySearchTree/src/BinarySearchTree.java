
public class BinarySearchTree<Key extends Comparable<Key>, Value>
{
	
	public static void main(String Args[]) {
		
		
		
		// initializing the binary search tree class object, cast it to hold String type and Integer type as the 2 generic parameter
		BinarySearchTree<String, Integer> bst = new BinarySearchTree<String, Integer>();
		bst.put("H", 444);
		bst.put("Ab", 124);
		bst.put("L", 82);
		bst.put("J", 82);
		bst.put("M", 4922);
		bst.put("D", 1522);
		bst.put("E", 822);
		bst.put("X", 6922);
		bst.put("Zm", 6922);
		bst.put("B", 6922);
		bst.put("C", 6922);
		
		/*                H
		 	 A               	   L
		      	 D		 		J    M
		      B	   E				   X
		       C						 Z
		 
		 */
		 
		// inserting all these nodes (Key,value) ( ) ( ) ( ) ( )   coins into the machine [{{ }}]
		bst.printInOrder();// print in the order of left/parent/right
		System.out.println("\n\n");
		System.out.println("The smallest Key is : " +bst.min()); // at least it knows the minimum is A
		System.out.println("The Biggest Key is : "+bst.max());System.out.println("\n\n");
		System.out.println("Getting the value of N is : "+bst.get("N"));
		System.out.println("Getting the value of M is : "+bst.get("M"));
		System.out.println("\n\nPosition of Ab key/Rank of position 0");
		System.out.println(bst.rank("Ab")+"----"+bst.select(0));
		System.out.println("\n\nPosition of B key/Rank of position 1");
		System.out.println(bst.rank("B")+"----"+bst.select(1));
		System.out.println("\n\nPosition of C key/Rank of position 2");
		System.out.println(bst.rank("C")+"----"+bst.select(2));
		System.out.println("\n\nPosition of D key/Rank of position 3");
		System.out.println(bst.rank("D")+"----"+bst.select(3));
		System.out.println("\n\nPosition of E key/Rank of position 4");
		System.out.println(bst.rank("E")+"----"+bst.select(4));
		System.out.println("\n\nPosition of H key/Rank of position 5");
		System.out.println(bst.rank("H")+"----"+bst.select(5));
		System.out.println("\n\nPosition of J key/Rank of position 6");
		System.out.println(bst.rank("J")+"----"+bst.select(6));
		System.out.println("\n\nPosition of L key/Rank of position 7");
		System.out.println(bst.rank("L")+"----"+bst.select(7));
		System.out.println("\n\nPosition of M key/Rank of position 8");
		System.out.println(bst.rank("M")+"----"+bst.select(8));
		System.out.println("\n\nPosition of X key/Rank of position 9");
		System.out.println(bst.rank("X")+"----"+bst.select(9));
		System.out.println("\n\nPosition of Z key/Rank of position 10");
		System.out.println(bst.rank("Z")+"----"+bst.select(10));
		
		System.out.println("\n\n");
		
		System.out.println(" the floor and ceiling of Aa is "+bst.floor("Aa")+" / "+bst.Ceiling("Aa"));
		System.out.println(" the floor and ceiling of G is "+bst.floor("G")+" / "+bst.Ceiling("G"));
		System.out.println(" the floor and ceiling of Y is "+bst.floor("Y")+" / "+bst.Ceiling("Y"));
		System.out.println(" the floor and ceiling of F is "+bst.floor("F")+" / "+bst.Ceiling("F"));
		System.out.println(" the floor and ceiling of N is "+bst.floor("N")+" / "+bst.Ceiling("N"));
		System.out.println(" the floor and ceiling of Za is "+bst.floor("Za")+" / "+bst.Ceiling("Za"));
		System.out.println(" the floor and ceiling of Zz is "+bst.floor("Zz")+" / "+bst.Ceiling("Zz"));
		System.out.println("\n\n");
		System.out.println("\n\nDeleteing the Minimum Key which is clearly Aa and Printing again");
		bst.deleteMin();
		System.out.println("\nCoincedentally , the nodes of H is 10 now, which is also the total amount of nodes in the tree");
		bst.printInOrder();
		System.out.println("After deletion, the rank is shifted accordingly, since Aa is deleted, Key B has the position 0 now\n");
	
		System.out.print("Position of B key is now :");
		System.out.println(bst.rank("B"));
		
		bst.deleteMax();
		System.out.println("\n\n");
		System.out.println("\n\nDeleteing the Max Key which is clearly Zm and Printing again");
		bst.printInOrder();
		System.out.println("\n\n");
		bst.printParentLeftRight();
		System.out.println("\n\nDeleteing the Key D and Printing again");
		bst.delete("D");
		bst.printInOrder();
		
		
	}
	
	
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
