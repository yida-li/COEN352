package ComparableSorting;

public class Example
{
	 private static void show(Comparable[] a) // Generic Type,,,,,,,
	 { // Print the array, on a single line.
	 for (int i = 0; i < a.length; i++)
	 System.out.print(a[i] + " ");
	 System.out.println();}

	private static void exch(Comparable[] a, int i, int j)
	 { Comparable t = a[i]; 
	 a[i] = a[j]; 
	 a[j] = t; }
		
	private static void sort(Comparable[] a, int lo, int hi)
	 { // loops N times, putting the smallest unit in front each time.
		for( int i=0;i<a.length;i++)    
	 	{
			Comparable yida= a[i];   //element yida, or object yida is the item of the array[i] so essentially every element in the item will be yida once and compared with the others
			for( int j=i+1;j<a.length;j++) 
			{ 
				int cmp= yida.compareTo(a[j]);  // integer cmp = a[i] - a[j]
				if (cmp>0)             // if a[i]-a[j] is a +, then it means a[j] is smaller and i need to put a[j] in front
				{
					yida=a[j];
					exch(a,i,j);  }}}} 

	 
	 public static void main(String[] args)
	 { // Read strings from standard input, sort them, and print.
		 
	 String [] b= {"b","w","a","d","f","g","h"};
	 Integer[] e= {3,4,2,1,2};
	 Character [] c= {'w','w','v','b','a','x','n'};
	 
	 //Presumably wrapper type conditioned by the creator of JAVA
	 // why does char[] c ={'w','w','v','b','a','x','n'}; work?
	 
	 sort(b,0,b.length);
	 sort(e,0,b.length);
	 sort(c,0,b.length);
	 
	
	 show(b);
	 show(e);
	 show(c);
	 }
}
