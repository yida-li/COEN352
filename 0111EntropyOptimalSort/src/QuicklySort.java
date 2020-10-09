public class QuicklySort
{


 
 private static void exch(Comparable[] a, int i, int j)
 { 
	 Comparable t = a[i]; 
	 a[i] = a[j]; 
	 a[j] = t; }
 
 private static void show(Comparable[] a)
 { // Print the array, on a single line.
 for (int i = 0; i < a.length; i++)
 System.out.print(a[i] + " ");
 System.out.println();
 }
 
 

	public static void sort(Comparable[] a)
	 {
	 
	 sort(a, 0, a.length - 1);
	 }
	private static void sort(Comparable[] a, int lo, int hi)
	 {
	 if (hi <= lo) return;
	 int lt = lo, i = lo+1, gt = hi;
	 Comparable v = a[lo];
	 while (i <= gt)
	 {
	 int cmp = a[i].compareTo(v);
	 		if (cmp < 0) exch(a, lt++, i++);
	 else if (cmp > 0) exch(a, i, gt--);
	 else i++;
	 } // Now a[lo..lt-1] < v = a[lt..gt] < a[gt+1..hi].
	 sort(a, lo, lt - 1);
	 sort(a, gt + 1, hi);
	 } 

 
 public static void main(String[] args)
 { // Read strings from standard input, sort them, and print.
	 
 String [] b= {"h","h","a","d","f","h","h"};

 sort(b);
 System.out.println("fast partitioning, the pivots all in the middle");
 show(b);
 }
}