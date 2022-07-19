
public class RedBlackBST<Key extends Comparable<Key>, Value>
{
	
	public static void main(String Args[]) {
		
		RedBlackBST<String, Integer> baby = new RedBlackBST<String, Integer>();
		baby.put("E", 2);
		baby.put("A", 2);
		baby.put("S", 2);
		baby.put("Y", 2);
		baby.put("Q", 2);
		baby.put("U", 2);
		baby.put("E", 2);
		baby.put("S", 2);
		baby.put("T", 2);
		baby.put("I", 2);
		baby.put("O", 2);
		baby.put("N", 2);
		
		
	}
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	private class Node
	{
	 Key key; // key
	 Value val; // associated data
	 Node left, right; // subtrees
	 int N; // # nodes in this subtree
	 boolean color; // color of link from
	 // parent to this node
	 Node(Key key, Value val, int N, boolean color)
	 {
	 this.key = key;
	 this.val = val;
	 this.N = N;
	 this.color = color;
	 }
	}
 private Node root;
public Value get(Key key) {
	
	Node x = root;
	while(x!=null)  // classive resurive until every logic is satisfied
	{
		
		int cmp= key.compareTo(x.key);
		if(cmp<0) x= x.left;
		else if  (cmp>0)x=x.right;
		else
			return x.val;
		
		
		
	}
	return null;
	
}
 private boolean isRed(Node x)
 {
  if (x == null) return false;
  return x.color == RED;
 }
 Node rotateLeft(Node h)
 {
  Node x = h.right;
  h.right = x.left;
  x.left = h;
  x.color = h.color;
  h.color = RED;
  x.N = h.N;
  h.N = 1 + size(h.left)
  + size(h.right);
  return x;
 }
 Node rotateRight(Node h)
 {
  Node x = h.left;
  h.left = x.right;
  x.right = h;
  x.color = h.color;
  h.color = RED;
  x.N = h.N;
  h.N = 1 + size(h.left)
  + size(h.right);
  return x;
 }
 void flipColors(Node h)
 {
  h.color = RED;
  h.left.color = BLACK;
  h.right.color = BLACK;
 }
 public int size()
 { return size(root); }
 private int size(Node x)
 {
 if (x == null) return 0;
 else return x.N;
 }
 public void put(Key key, Value val)
 { // Search for key. Update value if found; grow table if new.
 root = put(root, key, val);
 root.color = BLACK;
 }
 private Node put(Node h, Key key, Value val)
 {
 if (h == null) // Do standard insert, with red link to parent.
 return new Node(key, val, 1, RED);
 int cmp = key.compareTo(h.key);
 if (cmp < 0) h.left = put(h.left, key, val);
 else if (cmp > 0) h.right = put(h.right, key, val);
 else h.val = val;
 if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
 if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
 if (isRed(h.left) && isRed(h.right)) flipColors(h);
 h.N = size(h.left) + size(h.right) + 1;
 return h;
 }
 
}
