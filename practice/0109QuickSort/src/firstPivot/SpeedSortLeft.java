
public class SpeedSortLeft
{ 
    /* This function takes the first element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    int partition(int arr[], int low, int high) 
    { 
    	int pivot= arr[low];
		int i=low+1;
		for( int j=low;j<=high;j++) {
			
		if(arr[j]<pivot)	
		{
			
			swap(arr,j,i++);
		}
		
		
		}
		swap(arr,i-1,low);
		return i-1;
		
		
    } 
  
    void swap(int []A,int x,int y) {
		int tempora= A[x];
		A[x]=A[y];
		A[y]=tempora;
	}

    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
             
            sort(arr, pi+1, high); sort(arr, low, pi-1);
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = {7,8,1,1,4,2,9,3}; 
        int n = arr.length; 
  
        SpeedSortLeft ob = new SpeedSortLeft(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array with pivot in front/ most left side"); 
        printArray(arr); 
    } 
} 