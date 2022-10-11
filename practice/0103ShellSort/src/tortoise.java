public class tortoise {
    public static void swap(int arr[],int x,int y){
        
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
	public static void main(String[] args) {
		

		int []arr = {5,7,11,1,2,4,5,1,1,5,2,1,2,2,45,1,2,2,0,1,4,8};
        
        int gap;
        
        for(gap=arr.length/2;gap>0;gap/=2){
        for(int i=gap;i<arr.length;i++){
        


            int temp= arr[i];// temp
            
            
            
            int j;
            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                arr[j] = arr[j - gap];

            // put temp (the original a[i]) in its correct
            // location
            arr[j] = temp;


        }
        
        }
        

        for( int i:arr)System.out.println(i); 
        //System.out.println(counter);

	}

}
