//https://www.geeksforgeeks.org/3-way-threesort-dutch-national-flag/

import java.util.*;
class dutchflag
{
 
    static int i, j;
     
/* This function partitions a[] in three parts
   a) a[l..i] contains all elements smaller than pivot
   b) a[i+1..j-1] contains all occurrences of pivot
   c) a[j..r] contains all elements greater than pivot */

// put partition like this [12,13,1,46,444,444,444,767575,3412345,5353555315]
//                           l       i             j              r         
// put partition like this [a,b,b,c,d,a,m,m,m,m,z,x,t,t,s] 
//                          l         i         j       r 



static void swap(int a[], int l, int r){
    int temp = a[l];
    a[l] = a[r];
    a[r] = temp;
}

static void threewaypartition(int a[], int l, int r)
{
  
//array     [42,444444,5,4,1,2,535,123,12222]  or   [42|4|5|4|1|2|535|123|12222]
//          |  |      | | | | |   |   |     | 
//          |  |      | | | | |   |   |     | 
//          |  |      | | | | |   |   |     | 
//indices   |0 |1     |2|3|4|5|6  |7  |8    |   
//          |  |      | | | | |   |   |     
//       i,p|l |      | | | | |   |   |j,r,q|
//          |  |      | | | | |   |   |     
//pivot v = |  |      | | | | |   |   |12222|
//          |  |      | | | | |   |   |     | 
//          |  |      | | | | |   |   |     | 
    i = l - 1; j = r;
    int p = l - 1, q = r;
    int v = a[r];    
 
    while (true)
    {       
   
        while (a[++i] < v);
//          [42,444444,5,4,1,2,535,123,12222] 
//before
//       i,p|l |      | | | | |   |   |j,r,q|
//after
//          |  | i    | | | | |   |   |     | 



        while (v < a[--j])
//          [42,444444,5,4,1,2,535,123,12222] 
//before
//       i,p|l |      | | | | |   |   |j,r,q|
//after
//          |  | i    | | | | |   |j  |     | 
            
                if (j == l) // we're done here
                break;                                 //break to line @126
 
        // we're also done here
        if (i >= j)
            break;                                     //break to line @126 
        swap(a,i,j);
//          [42,444444,5,4,1,2,535,123,12222] 
//before
//       i,p|l |      | | | | |   |   |j,r,q|
//          |  | i    | | | | |   |j  |     |
//after
//          [42,123,5,4,1,2,535,444444,12222]  
//          |  | i | | | | |   |j     |     | 
        





/************************************************/ 
//     difference from assignment 2 is that elements which 
//     are equal to the pivot will be put to the side for now to be swaped back in line

//      |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |
//      | A | B | D | K | G | D | L | M | O | S | T | B | A | S | K |
//   i,p|   |   |   |   |   |   |   |   |   |   |   |   |   |   |j,q|
  
//      | A | B | D | K | G | D | L | M | O | S | T | B | A | S | K | 
//     p|   |   |   | i |   |   |   |   |   |   |   |   | j |   |   | 

//      | A | B | D | A | G | D | L | M | O | S | T | B | K | S | K | 
//     p|   |   |   | i |   |   |   |   |   |   |   |   | j |   | q |  
   
        if (a[i] == v) {p++;swap(a,i,p);}
//      | A | B | D | A | G | D | L | M | O | S | T | B | K | S | K | 
//     p|   |   |   | i |   |   |   |   |   |   |   |   | j |   | q |  

        if (a[j] == v) {q--;swap(a,q,j);}
//      | A | B | D | A | G | D | L | M | O | S | T | B | K | S | K | 
//     p|   |   |   | i |   |   |   |   |   |   |   |   | j | q |   |  
//      | A | B | D | A | G | D | L | M | O | S | T | B | S | K | K |
//     p|   |   |   | i |   |   |   |   |   |   |   |   | j | q |   |
    }
 







//      | A | B | D | A | G | D | L | M | O | S | T | B | K | S | K | 
//     p|   |   |   | i |   |   |   |   |   |   |   |   | j | q |   |  
//      | A | B | D | A | G | D | L | M | O | S | T | B | S | K | K |
//     p|   |   |   |   |   |   | i |   |   |   |   | j |   | q |   |

//      | A | B | D | A | G | D | B | M | O | S | T | L | S | K | K |
//     p|   |   |   |   |   |   | i |   |   |   |   | j |   | q |   |
//      | A | B | D | A | G | D | B | M | O | S | T | L | S | K | K |
//     p|   |   |   |   |   |   |   |i,j|   |   |   |   |   | q |   |      <--- r for right
/******************************************************************************************/
    swap(a,i,r); // 
/******************************************************************************************/
//      | A | B | D | A | G | D | B | K | O | S | T | L | S | K | M |
//     p|   |   |   |   |   |   |   |i,j|   |   |   |   |   | q | r | 
    int j = i - 1;
    for (int k = l; k < p; k++, j--)
    {swap(a,k,j);}
//      | A | B | D | A | G | D | B | K | O | S | T | L | S | K | M |
//     p|   |   |   |   |   |   | j | i |   |   |   |   |   | q |   |   
    i = i + 1;
    for (int k = r - 1; k > q; k--, i++)
    {swap(a,i,k);}
//      | A | B | D | A | G | D | B | K | O | S | T | L | S | K | M |
//     p|   |   |   |   |   |   | j |   | i |   |   |   |   | q | k | 
//      | A | B | D | A | G | D | B | K | O | S | T | L | S | K | M |
//     p|   |   |   |   |   |   | j |   | i |   |   |   |   |q,k|   |
//      | A | B | D | A | G | D | B | K | K | S | T | L | S | O | M |
//     p|   |   |   |   |   |   | j |   | i |   |   |   |   |q,k|   |
//      | A | B | D | A | G | D | B | K | K | S | T | L | S | O | M |
//     p|   |   |   |   |   |   | j |   |   | i |   |   |   |q,k|   |
}
 

static void threesort(int a[], int l, int r)
{
    if (r <= l)  
        return;
    i = 0; j = 0; // THEY ARE STATIC/SHARED/GLOBAL/UNIVERSAL
//       |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |
//       |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |
//       | A | B | D | K | G | D | L | M | O | S | T | B | A | S | K |
    threewaypartition(a, l, r);
//       | A | B | D | A | G | D | B | K | K | S | T | L | S | O | M |
//       |                           | K | K |                       |    <-- middle partition forever sorted
//      p| l |   |   |   |   |   | j |   |   | i |   |   |   |q,k| r |
    threesort(a, l, j);
//       | A | B | D | A | G | D | B | 
//      p| l |   |   |   |   |   | j |
    threesort(a, i, r);                               
//                                           | S | T | L | S | O | M |                     
//                                          p| i |   |   |   |   | r |

//
}
 
static void show(int a[], int n)
{
    for (int i = 0; i < n; ++i)System.out.printf("%d  ", a[i]);System.out.printf("\n");
}
 

public static void main(String[] args)
{
    int a[] = { 4, 5, 4, 4, 1, 9, 4, 4, 9, 5, 4, 1, 5 };
    int size = a.length;
   
    show(a, size);

    threesort(a, 0, size - 1);

    show(a, size);
}
}