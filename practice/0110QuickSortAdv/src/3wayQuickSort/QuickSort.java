package ch07;
import java.util.*;
public class QuickSort {

	static public int i, j;
	static public int counter =0;
	static private Random value = new Random();

	public static void sort(Integer A[]) {
		threesort(A, 0, A.length-1);
	}

	static void threesort(Integer a[], int l, int r)
	{
		if (r <= l)
			return;
		i = 0; j = 0;
		threewaypartition(a, l, r);
		threesort(a, l, j);
		threesort(a, i, r);
	}

	static void threewaypartition(Integer a[], int l, int r)
	{
		counter=counter+1;
		i = l - 1; j = r;
		int p = l - 1, q = r;
		int v = a[r];
		while (true)
		{
			while (a[++i] < v);
			while (v < a[--j])
				if (j == l)
					break;                                 //break to line 46
			if (i >= j)
				break;									   //break to line 46
			swap(a,i,j);

			if (a[i] == v) {p++;swap(a,i,p);}
			if (a[j] == v) {q--;swap(a,q,j);}
		}
		swap(a,i,r);
		int j = i - 1;
		for (int k = l; k <= p; k++, j--)
		{swap(a,k,j);}
		i = i + 1;
		for (int k = r - 1; k >= q; k--, i++)
		{swap(a,i,k);}
	}

	static void permute(Integer[] A) {
		for (int i = A.length; i > 0; i--)
			swap(A, i-1, random(i));
	}
	static int random(int n) {
		return Math.abs(value.nextInt()) % n;
	}
	static void swap(Integer[] A, int p1, int p2) {
		int temp = A[p1];
		A[p1] = A[p2];
		A[p2] = temp;
	}
	static String print(Integer a[], int n)
	{
		String book="";
		for (int i = 0; i < n; ++i)
		{

			book+="  ";
			book+=a[i];
		}
		return book;
	}
}
