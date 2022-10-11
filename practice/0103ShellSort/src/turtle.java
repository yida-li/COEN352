
public class turtle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {5,7,11,0,1,4,8};
        int n=arr.length;
        
        for (int gap = n/4; gap > 0; gap /= 4) // because its always gonna be decremented at one point to 1
        {
         
            for (int i = gap; i < n; i += 1)
            {
 
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                /*for( int ii:arr)System.out.print(ii+" "); 
                System.out.println();
                */
                arr[j] = temp;
                /*                for( int ii:arr)System.out.print(ii+" "); 
                System.out.println();
                */

            }
        }
        //for( int i:arr)System.out.println(i); 
        

	}

}
