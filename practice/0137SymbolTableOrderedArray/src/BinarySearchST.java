
public class BinarySearchST<Key extends Comparable<Key>, Value>
{
 private Key[] keys;
 private Value[] vals;
 private int N;
 private int numberofCompares=0;
 public BinarySearchST()
 { 
 keys = (Key[]) new Comparable[8];
 vals = (Value[]) new Object[8];
 }
 private void resize(int capacity) {   //resizing
     Key[] tempk = (Key[]) new Comparable[capacity];
     Value[] tempv = (Value[]) new Object[capacity];
     for (int i = 0; i < N; i++)
         tempv[i] = vals[i];
     for (int i = 0; i < N; i++)
         tempk[i] = keys[i];
     keys = tempk;
     vals = tempv;
 }
 public int size()
 { return N; }
 public boolean isEmpty() {
	 return size()==0;
 }
 public Value get(Key key)
 {
 if (isEmpty()) return null;
 int i = rank(key);
 if (i < N && keys[i].compareTo(key) == 0) return vals[i];
 else return null;
 }
 public int rank(Key key) {
	 {
		 int lo = 0, hi = N-1;
		 while (lo <= hi)
		 {
		 int mid = lo + (hi - lo) / 2;
		 int cmp = key.compareTo(keys[mid]);
		 numberofCompares++;
		 if (cmp < 0) hi = mid - 1;
		 else if (cmp > 0) lo = mid + 1;
		 else return mid;
		 }
		 return lo;
		}
 }
 public boolean contains(Key key) {
     int i = bsearch(key);
     return i >= 0;
 }
 private int bsearch(Key key) {
     int lo = 0, hi = N-1;
     int counter=0;
     while (lo <= hi) {
         int mid = lo + (hi - lo) / 2;
         int cmp = key.compareTo(keys[mid]);
         counter++;
         if      (cmp < 0) hi = mid - 1;
         else if (cmp > 0) lo = mid + 1;
         else {
        	 System.out.println(counter);
        	 return mid;
         }
     }
     return -1;
 }
 // See page 381.
 public void put(Key key, Value val)
 { // Search for key. Update value if found; grow table if new.
	 if (N >= vals.length) resize(2*N);
	 int i = rank(key);
 
 if (i < N && keys[i].compareTo(key) == 0)
 {
	 vals[i] = val;
	 return; 
 }
 /*if (contains(key)) {   another way for duplicate 
     int i = bsearch(key);
     vals[i] = val;
     return;
 }*/
 numberofCompares++;
 for (int j = N; j > i; j--)
 { 
	 keys[j] = keys[j-1]; 
	 vals[j] = vals[j-1]; 
	 }
 keys[i] = key; 
 vals[i] = val;
 N++;
 System.out.println("Inserting the key : "+key+" The total number of comparaisons is :"+numberofCompares);
 }
 public void delete(Key key) {
	 
 }
 public void print() {
	 for( int i=0;i<N;i++) {
		 System.out.println(keys[i]+" "+vals[i]);
	 }
 }
 public void printKey() {
	 for( int i=0;i<N;i++) {
		 System.out.print(keys[i]+" ");
	 }
	 
		 System.out.println("");
	 
 }
 public Key min()
 { return keys[0]; }
 public Key max()
 { return keys[N-1]; }
 public Key select(int k)
 { return keys[k]; }
 public static void main(String[] args) 
 { 
	 BinarySearchST<String,Integer> bbb = new BinarySearchST<String,Integer>();
	 bbb.put("E", 24);
	 bbb.put("A", 6452);
	 bbb.put("S", 4532);
	 bbb.put("Y", 2001);
	 bbb.put("Q", 2001);
	 bbb.put("U", 2001);
	 bbb.put("E", 2001);
	 System.out.println("Inserting the key : E The total number of comparaisons is :"+bbb.numberofCompares);
	 bbb.put("S", 452);
	 System.out.println("Inserting the key : S The total number of comparaisons is :"+bbb.numberofCompares);
	 bbb.put("T", 452);
	 bbb.put("I", 452);
	 bbb.put("O", 452);
	 bbb.put("N", 452);
	 bbb.printKey();
	 System.out.println("binary searching Key Q : found at position " +bbb.bsearch("Q"));
	System.out.println("Total amount of compares :"+bbb.numberofCompares);
   
 }
 // See Exercise 3.1.16 for this method.
}